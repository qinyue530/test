package com.base.testThread;

public class OnlyThread {
	public static int sum = 0;
	public static int count = 1;
	public static void main(String[] args) {
		
		final Thread t1 = new Thread() {
			public void run() {
				for(int i = 0 ; i < 25 ; i++) {
					sum+=count;
					System.out.println("t1.sum ========" + sum);
					count++;
				}
			}
		};
		

		Thread t2 = new Thread() {
			public void run() {
				for(int i = 0 ; i < 25 ; i++) {
					sum+=count;
					System.out.println("t2.sum ========" + sum);
					count++;
				}
			}
		};
		

		Thread t3 = new Thread() {
			public void run() {
				for(int i = 0 ; i < 25 ; i++) {
					sum+=count;
					System.out.println("t3.sum ========" + sum);
					count++;
				}
			}
		};
		

		Thread t4 = new Thread() {
			public void run() {
				for(int i = 0 ; i < 25 ; i++) {
					sum+=count;
					System.out.println("t4.sum ========" + sum);
					count++;
				}
			}
		};
		
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}
}
