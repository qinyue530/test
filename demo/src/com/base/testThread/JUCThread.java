package com.base.testThread;

import java.util.concurrent.atomic.AtomicInteger;

public class JUCThread {
	private static volatile AtomicInteger count = new AtomicInteger(0);
	public static void main(String[] args) {
		Runnable a = new Runnable() {
			@Override
			public void run() {
				for(int i = 0 ; i < 25 ; i++) {
					count.incrementAndGet();
					System.out.println(count);
				}
			}
		};
		
		Thread t1 = new Thread(a);
		Thread t2 = new Thread(a);
		Thread t3 = new Thread(a);
		Thread t4 = new Thread(a);
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		
	}
}
