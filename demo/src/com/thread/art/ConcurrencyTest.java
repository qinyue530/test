package com.thread.art;
/*
 串行：一个执行完再执行另一个

并行：两个一起执行

并发：有多个，同一时刻只有一个在执行，但是，轮流切换执行，看起来像是同时执行

并发，线程上下文切换会有开销，减少上下文切换的方法有无锁并发编程、CAS算法、使用最少线程和使用协程。

·无锁并发编程。多线程竞争锁时，会引起上下文切换，所以多线程处理数据时，可以用一些办法来避免使用锁，
如将数据的ID按照Hash算法取模分段，不同的线程处理不同段的数据。

·CAS算法。Java的Atomic包使用CAS算法来更新数据，而不需要加锁。

·使用最少线程。避免创建不需要的线程，比如任务很少，但是创建了很多线程来处理，这样会造成大量线程都处于等待状态。

·协程：在单线程里实现多任务的调度，并在单线程里维持多个任务间的切换。
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
