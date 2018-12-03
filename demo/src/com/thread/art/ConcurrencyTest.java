package com.thread.art;
/*
 串行：一个执行完再执行另一个

并行：两个一起执行

并发：有多个，同一时刻只有一个在执行，但是，轮流切换执行，看起来像是同时执行
 */
public class ConcurrencyTest {
	private static final long count = 1001;

	public static void main(String[] args) throws InterruptedException {
		concurrency();
		serial();
	}

	/**
	 * 并发
	 * 
	 * @throws InterruptedException
	 */
	private static void concurrency() throws InterruptedException {
		long star = System.currentTimeMillis();
		Thread thread = new Thread() {
			public void run() {
				int a = 0;
				for (int i = 0; i < count; i++) {
					a += 5;
//					System.out.println("********************");
				}
			}
		};
		thread.start();
		int b = 0;
		for (long i = 0; i < count; i++) {
			b--;
//			System.out.println("--------------");
		}
		long time = System.currentTimeMillis() - star;
		thread.join();
		System.out.println("并发concurrency: " + time + "ms , " + b);
	}
	/**
	 * 串行
	 */
	private static void serial() {
		long start = System.currentTimeMillis();
		int a = 0;
		for (long i = 0; i < count; i++) {
			a += 5;
//			System.out.println("-------------");
		}
		int b = 0;
		for (long i = 0; i < count; i++) {
//			System.out.println("*************");
			b--;
		}
		long time = System.currentTimeMillis() - start;
		System.out.println("串行serial: " + time + "ms , b = " + b + ", a = " + a);
	}

}
