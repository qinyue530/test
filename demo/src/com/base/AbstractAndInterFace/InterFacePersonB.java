package com.base.AbstractAndInterFace;

public class InterFacePersonB implements InterFace1 ,InterFace2{
	public int i = 200;
	public static int s = 200;
	public final int f = 200;
	public static final int sf = 200;
	@Override
	public void get() {
		System.out.println("B========get");
		
	}
	@Override
	public void set() {
		// TODO Auto-generated method stub
		System.out.println("B========set");
	}

	@Override
	public void jump() {
		System.out.println("B========jump");
		
	}

}
