package com.designPattern.FactoryAbstract;

public interface Tyre {
	void revolve();
}
class LuxuryTyre implements Tyre{

	@Override
	public void revolve() {
		// TODO Auto-generated method stub
		System.out.println("轮胎好");
	}
	
}
class LowTyre implements Tyre{

	@Override
	public void revolve() {
		// TODO Auto-generated method stub
		System.out.println("轮胎不好");
	}
	
}