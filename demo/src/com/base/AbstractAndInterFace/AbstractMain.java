package com.base.AbstractAndInterFace;

public class AbstractMain {
	public static void main(String[] args) {
		AbstractPerson abstractPersion = new AbstractPerson() {};
		AbstractPerson abstractPersion1 = new AbstractPerson() {
			public int getAge() {
				System.out.println("abstractPersion1");
				return age;
			}
//			public void jump() {
//				System.out.println("abstractPersion1====jump");
//			}
		};
		AbstractPerson a = new AbstractPersonA();
		AbstractPerson b = new AbstractPersonB();
		AbstractPersonA a1 = new AbstractPersonA();
		AbstractPersonB b1 = new AbstractPersonB();
		System.out.println("====="+abstractPersion.getAge());
//		abstractPersion1.jump();
		System.out.println("====="+abstractPersion1.getAge() + "*****");
		System.out.println(a.getAge());
		System.out.println(b.getAge());
		a1.jump();
		b1.jump();
	}
}
