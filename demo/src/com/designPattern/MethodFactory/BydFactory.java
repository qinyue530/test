package com.designPattern.MethodFactory;

public class BydFactory implements CarFactory{

	@Override
	public Car creatCar() {
		// TODO Auto-generated method stub
		return new Byd();
	}
	
}
