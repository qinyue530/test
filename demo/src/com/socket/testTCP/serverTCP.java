package com.socket.testTCP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class serverTCP {
	public static void main(String[] args) {
		try {
			
			ServerSocket serverSocket = new ServerSocket(1234);
			while(true) {
				Socket socket = serverSocket.accept();
				
				BufferedReader bufferReader = 
						new BufferedReader(new InputStreamReader(socket.getInputStream()));
				String result = bufferReader.readLine();
				System.out.println("client say:" + result);
 				PrintWriter printWriter = 
						new PrintWriter(socket.getOutputStream());
				printWriter.print("hello Client , I am Server !");
				
				printWriter.flush();
				 
                /** 关闭Socket*/
                printWriter.close();
                bufferReader.close();
                socket.close();
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
