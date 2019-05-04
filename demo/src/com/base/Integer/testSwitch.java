package com.base.Integer;

public class testSwitch {
	public static void main(String[] args) {
		int i  = 1;
		switch (i) {
		case 1:
			i+= 2 ;
			System.out.println(111111);
			break;
		case 2:
			i+=3;
			System.out.println(222222);
			break;
		case 3:
			System.out.println(333333);
			i+=5;
			break;
		default:
			break;
		}
		System.out.println(i);
	}
}
