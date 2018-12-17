package com.designPattern.Single;
/**
 * 饿汉式单例， 类加载是 就 创建 单例对象， 线程安全 ， 调用效率高 ， 不能延时加载
 * @author qin_Yue
 *
 */
public class Hungry {
	private static Hungry instance  = new Hungry();
	private Hungry() {}
	public static Hungry getSlacker() {
		return instance;
	}
	
}
