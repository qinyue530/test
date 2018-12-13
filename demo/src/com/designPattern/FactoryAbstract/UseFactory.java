package com.designPattern.FactoryAbstract;

public class UseFactory {
	public static void main(String[] args) {
		CarFactory factory = new LuxuryCarFactory();
		factory.creatEngine().run();
		factory.creatEngine().star();
	}
}
