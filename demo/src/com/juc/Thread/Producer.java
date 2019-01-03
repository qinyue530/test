package com.juc.Thread;

public class Producer implements Runnable {
	Resource r;

	Producer(Resource r) {
		this.r = r;
	}

	public void run() {
		while (true) {
			r.set("烤鸭");
		}
	}

}
