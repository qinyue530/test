package com.base.AbstractAndInterFace;

public abstract class Person {
	private String name = "Persion";
	private int age = 100;
	
	public void getName() {
		System.out.println(name);
	}
	public void setName(String name) {
		this.name = name;
	}
	public void getAge() {
		System.out.println(age);
	}
	public void setAge(int age) {
		this.age = age;
	}
}
