package com.base.io;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class BufferAndFile {
	public static void main(String[] args) {
		try {
			FileWriter fw = new FileWriter("D:\\IOTEST.text");
			BufferedWriter bw = new BufferedWriter(fw);
			for(int i = 0 ; i < 20 ; i++) {
					bw.append(String.valueOf(i));
			}
			bw.close();
			fw.close();
		} catch (Exception e) {
			System.out.println("==============");
		}
	}
}
