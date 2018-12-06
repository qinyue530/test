package com.qy.test;

public class Main {
	public static void main(String[] args) {
		testInterFace a = new implentsInterFace();
		testInterFace b = new implentsInterFace1();
		a.get();
		b.get();
		System.out.println(a.a);
		System.out.println(b.a);
		implentsInterFace c = new implentsInterFace();
		implentsInterFace1 d = new implentsInterFace1();
		c.get();
		d.get();
		System.out.println(c.a);
		System.out.println(d.a);
	}
}
