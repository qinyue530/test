package com.designPattern.FactorySimple;

public class UseFactory {
	public static void main(String[] args) {
		Car c1 = CarFactoey.creatCar("奥迪");
		Car c2 = CarFactoey.creatCar("比亚迪");
		c1.run();
		c2.run();
	}
}
