package com.juc.Thread;

public class Consumer implements Runnable {
	Resource r;

	Consumer(Resource r) {
		this.r = r;
	}

	public void run() {
		while (true) {
			r.out();
		}
	}
}