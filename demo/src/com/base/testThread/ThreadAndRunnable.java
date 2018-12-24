package com.base.testThread;

public class ThreadAndRunnable {
	public static volatile int sum = 0;
	public static volatile int count = 1;
	public static void main(String[] args) {
		Runnable r1 = new Runnable() {
			@Override
			public void run() {
				synchronized ((Object) count) {
					// TODO Auto-generated method stub
					for(int i = 0 ; i < 25 ; i++) {
						sum+=count;
						System.out.println("sum= " + sum);
						count++;
					}
				}
				
			}
		};
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r1);
		Thread t3 = new Thread(r1);
		Thread t4 = new Thread(r1);
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}
}
