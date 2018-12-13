package com.designPattern.Single;
/**
 * 懒汉式 单例 ， 调用效率不高 ， 可以延时加载
 * @author qin_Yue
 *
 */
public class Slacker {
	private static Slacker instance ;
	private Slacker() {}
	public synchronized Slacker getSlacker() {
		if(instance == null) {
			instance = new Slacker();
		}
		return instance;
	}
	
}
