package com.base.AbstractAndInterFace;

public class InterFaceMain {
	public static void main(String[] args) {
		InterFace1 B1 = new InterFacePersonB();
		InterFace2 B2 = new InterFacePersonB();
		InterFacePersonB B3 = new InterFacePersonB();
		System.out.println("B1 相关值 " + B1.i + " " + B1.s + " " + B1.f + " " + B1.sf );
		System.out.println("B2 相关值 " + B2.i + " " + B2.s + " " + B2.f + " " + B2.sf );
		System.out.println("B3 相关值 " + B3.i + " " + B3.s + " " + B3.f + " " + B3.sf );
		System.out.println("B3 相关值 1" + B3.i1 + " " + B3.s1 + " " + B3.f1 + " " + B3.sf1 );
		System.out.println("B1===========");
		B1.get();
		B1.set();
		System.out.println("B2===========");
		B2.get();
		B2.set();
		B2.jump();
		System.out.println("B3===========");
		B3.get();
		B3.set();
		B3.jump();
		
		
		System.out.println("=======================");
		InterFace1 A = new InterFacePersonA();
		A.get();
		A.set();
		System.out.println(A.i);
		System.out.println(A.s);
		System.out.println(A.f);
		System.out.println(A.sf);
		InterFacePersonA A1 = new InterFacePersonA();
		System.out.println(A1.i);
		System.out.println(A1.s);
		System.out.println(A1.f);
		System.out.println(A1.sf);
		A1.jump();
		
	}
}
