package com.juc.Thread;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Resource {
	private String name;
	private int count = 1; // 记录烤鸭的编号
	private boolean flag = false;

	// 创建一个锁对象
	Lock lock = new ReentrantLock();

	// 通过已有的锁获取两组监视器, 一组监视生产者, 一组监视消费者
	Condition producer_con = lock.newCondition();
	Condition consumer_con = lock.newCondition();

	public void set(String name) {
		lock.lock(); // 获取锁
		try {
			while (flag)
				try {
					producer_con.wait();
				} catch (InterruptedException e) {
				}
			this.name = name + count;
			count++;
			System.out.println(Thread.currentThread().getName() + "..生产者.." + this.name);
			flag = true;
			consumer_con.signal();
		} finally {
			lock.unlock(); // 释放锁
		}
	}

	public void out() {
		lock.lock(); // 获取锁
		try {
			while (!flag)
				try {
					consumer_con.wait();
				} catch (InterruptedException e) {
				}
			System.out.println(Thread.currentThread().getName() + "...消费者.." + this.name);
			flag = false;
			producer_con.signal();
		} finally {
			lock.unlock(); // 释放锁
		}
	}
}