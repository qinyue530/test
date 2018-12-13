package com.designPattern.FactoryMethod;

public class UseFactory {
	public static void main(String[] args) {
		Car c1 = new AudiFactory().creatCar();
		Car c2 = new BydFactory().creatCar();
		Car c3 = new BenzFactory().creatCar();
		
		c1.run();
		c2.run();
		c3.run();
	}
}
