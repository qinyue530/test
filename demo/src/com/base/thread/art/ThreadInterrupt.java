package com.base.thread.art;
import java.util.concurrent.TimeUnit;
public class ThreadInterrupt {
	static class SleepRunable implements Runnable {
		public void run() {
			int i = 0;
			while(true) {
				try {
					Thread.sleep(1);
					System.out.println(" i = " + i++  + "-----------------------");
				} 
				catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
//					System.out.println("1111111");
				}
			}
		}
	}
	static class BusyRunnable implements Runnable{
		public void run() {
			while(true) {
			}
		}
	}
	
	public static void main(String[] args) throws Exception{
		Thread SleepThread = new Thread(new SleepRunable(),"SleepRunable");
		Thread BusyThread = new Thread(new BusyRunnable(),"BusyRunnable");
		SleepThread.setDaemon(true);
		BusyThread.setDaemon(true);
		SleepThread.start();
		BusyThread.start();
		TimeUnit.SECONDS.sleep(5);
		SleepThread.interrupt();
		BusyThread.interrupt();
		System.out.println("SleepThread interrupted is " + SleepThread.isInterrupted());
		System.out.println("BusyThread interrupted is " + BusyThread.isInterrupted());
//		if(!SleepThread.isInterrupted()) {
//			SleepThread.interrupt();
//			System.out.println("二次终断状态SleepThread interrupted is " + SleepThread.isInterrupted());
//		}
	}
}
