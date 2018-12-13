package com.designPattern.AbstractFactory;

public interface Engine {
	void run();
	void star();
}

class LuxuryEngine implements Engine{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("快");
	}

	@Override
	public void star() {
		// TODO Auto-generated method stub
		System.out.println("快");
	}
	
}

class LowEngine implements Engine{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("慢");
	}

	@Override
	public void star() {
		// TODO Auto-generated method stub
		System.out.println("慢");
	}
	
}