package com.designPattern.ProxyDynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class StarHandler implements InvocationHandler{
	
	Star realStar;
	public StarHandler(Star realStar) {
		// TODO Auto-generated constructor stub
		super();
		this.realStar = realStar;
	}
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("=============");
		method.invoke(realStar, args);
		return null;
	}

}
