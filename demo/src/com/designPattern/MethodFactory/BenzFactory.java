package com.designPattern.MethodFactory;

public class BenzFactory implements CarFactory{

	@Override
	public Car creatCar() {
		// TODO Auto-generated method stub
		return new Benz();
	}

}
