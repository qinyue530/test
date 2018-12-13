package com.designPattern.ProxyStatic;

public class UseProxy {
	public static void main(String[] args) {
		Star real = new RealStar();
		Star proxy = new ProxyStar(real);
		proxy.confer();
		proxy.sigContract();
		proxy.boolTicket();
		proxy.collectMoney();
		proxy.sing();
	}
}
