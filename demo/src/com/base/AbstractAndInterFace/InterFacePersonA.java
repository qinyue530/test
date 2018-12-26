package com.base.AbstractAndInterFace;

public class InterFacePersonA implements InterFace1   {
	public int i = 10;
	public static int s = 10;
	public final int f = 10;
	public static final int sf = 10;
	public void jump() {
		System.out.println("jump");
	}
	
	@Override
	public void get() {
		System.out.println("A==========get");
		
	}

	@Override
	public void set() {
		// TODO Auto-generated method stub
		System.out.println("A==========set");
	}

}
