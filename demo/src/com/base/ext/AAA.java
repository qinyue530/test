package com.base.ext;
class A {
	int i;
	A(){System.out.println("A---空构造");};
	A(int i){System.out.println("A---构造 i = " + i);};
	void run() {
		System.out.println("A---run");
	}
}
class B extends A{
	int i;
	B(){System.out.println("B---空构造");};
	B(int i){System.out.println("B---构造 i = " + i);};
	void run() {
		System.out.println("B---run");
	}
}
public class AAA {
	public static void main(String[] args) {
		A b = new B(1);
		b.run();
	}
}
