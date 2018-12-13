package com.designPattern.SimpleFactory;
/**
 * 测试在没有工厂模式下的情况
 * @author qin_Yue
 *
 */
public class NoFactory {
	public static void main(String[] args) {
		// 创建时 既要依赖Car 接口 也要依赖实体类 
		Car c1 = new Audi();
		Car c2 = new Byd();
		
		c1.run();
		c2.run();
	}
}
