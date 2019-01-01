package com.socket.testTCP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class clientTCP {
	public static void main(String[] args) {
		String ip = "127.0.0.1";
		int port = 1234;
		Socket socket;
		try {
			socket = new Socket(ip, port);
			socket.setSoTimeout(60000);
			PrintWriter printWriter = new PrintWriter(socket.getOutputStream() , true);
			BufferedReader sysBuff = new BufferedReader(new InputStreamReader(System.in));
			printWriter.println(sysBuff.readLine());
			printWriter.flush();
			
			BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			 String result = bufferedReader.readLine();
	         System.out.println("Server say : " + result);

	         /** 关闭Socket*/
	         printWriter.close();
	         bufferedReader.close();
	         socket.close();
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
