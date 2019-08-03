package com.aaa;

import java.util.concurrent.atomic.AtomicInteger;

public class test {
	private static AtomicInteger atomic = new AtomicInteger(0001);
	private static String time;
	public static void main(String[] args) {
		String str = null;
		System.out.println(atomic.getAndIncrement());
		if(time.equals(String.valueOf(System.currentTimeMillis())))
			 str = String.valueOf(atomic) + String.valueOf(System.currentTimeMillis());
		System.out.println(str);
		atomic.getAndIncrement();
		System.out.println(atomic);
		
	}
}
