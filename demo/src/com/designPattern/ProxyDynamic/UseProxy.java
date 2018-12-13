package com.designPattern.ProxyDynamic;

import java.lang.reflect.Proxy;

public class UseProxy {
	public static void main(String[] args) {
		Star realStar = new RealStar();
		StarHandler handler = new StarHandler(realStar);
		Star proxy = (Star)Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(), new Class[] {Star.class}, handler);
		
		proxy.boolTicket();
		proxy.sing();
		
	}
}
