package com.designPattern.ProxyStatic;

public class ProxyStar implements Star{

	private Star star;
	
	public ProxyStar(Star star) {
		// TODO Auto-generated constructor stub
		this.star = star;
	}
	
	@Override
	public void confer() {
		// TODO Auto-generated method stub
		System.out.println("代理面谈");
	}

	@Override
	public void sigContract() {
		// TODO Auto-generated method stub
		System.out.println("代理签合同");
	}

	@Override
	public void boolTicket() {
		// TODO Auto-generated method stub
		System.out.println("代理订票");
	}

	@Override
	public void sing() {
		// TODO Auto-generated method stub
		star.sing();
	}

	@Override
	public void collectMoney() {
		// TODO Auto-generated method stub
		System.out.println("代理收钱");
	}

}
