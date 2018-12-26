package com.base.AbstractAndInterFace;

public class AbstractPersonA  extends AbstractPerson{
	String name;
	int age;
	public String getName() {
		System.out.println("A=====name");
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		System.out.println("B======age");
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void jump() {
		System.out.println("jump====");
	}
}
