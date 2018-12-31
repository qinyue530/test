package com.base.Reflection;

public class Person {
	public String namePublic;
	private String namePrivate;
	String nameDefault;
	protected String nameProtected;
	
	public void getNamePublic() {
		System.out.println(namePublic);
	}
	public Person() {}
	public Person(String namePublic, String namePrivate, String nameDefault, String nameProtected) {
		super();
		this.namePublic = namePublic;
		this.namePrivate = namePrivate;
		this.nameDefault = nameDefault;
		this.nameProtected = nameProtected;
	}

	private void getNamePrivate() {
		System.out.println(namePrivate);
	}
	
	void getNameDefault() {
		System.out.println(nameDefault);
	}
	
	protected void getNameProtected() {
		System.out.println(nameProtected);
	}
	
}
