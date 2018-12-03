package com.thread.art;
/*
现在我们介绍避免死锁的几个常见方法。
·避免一个线程同时获取多个锁。
·避免一个线程在锁内同时占用多个资源，尽量保证每个锁只占用一个资源。
·尝试使用定时锁，使用lock.tryLock（timeout）来替代使用内部锁机制。
·对于数据库锁，加锁和解锁必须在一个数据库连接里，否则会出现解锁失败的情况。
 */
public class DeadLockDemo {
	private static String A = "A";
	private static String B = "B";
	/**
	 *这段代码会引起死锁，使线程t1和线程t2互相等待对方释放锁。
	 */
	private void deadLock() {
		Thread t1 = new Thread() {
			public void run() {
				System.out.println("执行t1");
				synchronized (A) {
					System.out.println("---t1A获得锁---");
					try {
						System.out.println("----t1休眠----");
						Thread.currentThread().sleep(2000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println("----t1休眠结束----");
					synchronized (B) {
						System.out.println("---t1B获得锁---");
					}
				}
			}
		};
		Thread t2 = new Thread() {
			public void run() {
				System.out.println("执行t2");
				synchronized (B) {
					System.out.println("---t2B获得锁---");
					synchronized (A) {
						System.out.println("---t2A获得锁---");
					}
				}
			}
		};
		t1.start();
		t2.start();
	}
	
	public static void main(String[] args) {
		new DeadLockDemo().deadLock();
	}
}
