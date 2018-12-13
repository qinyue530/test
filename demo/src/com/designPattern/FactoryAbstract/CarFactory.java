package com.designPattern.FactoryAbstract;

public interface CarFactory {
	Engine creatEngine();
	Seat creatSeat();
	Tyre creatTyre();
}

class LuxuryCarFactory implements CarFactory{

	@Override
	public Engine creatEngine() {
		// TODO Auto-generated method stub
		return new LuxuryEngine();
	}

	@Override
	public Seat creatSeat() {
		// TODO Auto-generated method stub
		return new LuxurySeat();
	}

	@Override
	public Tyre creatTyre() {
		// TODO Auto-generated method stub
		return new LuxuryTyre();
	}
	
}

class LowCarFactory implements CarFactory{

	@Override
	public Engine creatEngine() {
		// TODO Auto-generated method stub
		return new LowEngine();
	}

	@Override
	public Seat creatSeat() {
		// TODO Auto-generated method stub
		return new LowSeat();
	}

	@Override
	public Tyre creatTyre() {
		// TODO Auto-generated method stub
		return new LowTyre();
	}
	
}