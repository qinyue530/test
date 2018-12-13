package com.designPattern.ProxyStatic;

public class RealStar implements Star{

	@Override
	public void confer() {
		// TODO Auto-generated method stub
		System.out.println("面谈");
	}

	@Override
	public void sigContract() {
		// TODO Auto-generated method stub
		System.out.println("签合同");
	}

	@Override
	public void boolTicket() {
		// TODO Auto-generated method stub
		System.out.println("订票");
	}

	@Override
	public void sing() {
		// TODO Auto-generated method stub
		System.out.println("歌手 - 唱歌");
	}

	@Override
	public void collectMoney() {
		// TODO Auto-generated method stub
		System.out.println("收钱");
	}

}
