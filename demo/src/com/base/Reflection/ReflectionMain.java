package com.base.Reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionMain {
	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Person person = new Person("namePublic", "namePrivate", "nameDefault", "nameProtected");
		// 第一种：对象.Class
		Class clazz = Class.forName("com.base.Reflection.Person");
		System.out.println("----------------------获取类的常量----------------------------------------------");
		Field[] field = clazz.getDeclaredFields();
		for (Field f : field) {
			System.out.println(f.getName() + "----------" + f.getType() + "----------" + f.getModifiers());
		}
		System.out.println("----------------------获取类的非构造方法的方法----------------------------------------------");
		Method[] method = clazz.getDeclaredMethods();
		for (Method m : method) {
			System.out.println(m.getName() + "----------" + m.getReturnType() + "---------" + m.getModifiers());
		}
		System.out.println("----------------------获取类的构造方法----------------------------------------------");
		Constructor[] constructors = clazz.getDeclaredConstructors();
		for (Constructor c : constructors) {
			System.out.println(c + "-------" + c.getName() + "------" + c.getModifiers());
		}
		System.out.println("----------------------获取类的相关的信息----------------------------------------------");
		System.out.println("类所在的包为：" + clazz.getPackage().getName());
		System.out.println("类名：" + clazz.getName());
		System.out.println("父类的名称：" + clazz.getSuperclass().getName());
		/***************************************************************************/
		Class clazz1 = Class.forName("com.base.Reflection.Person");
		// 指定有参的构造方法
		Constructor cons = clazz.getConstructor(new Class[] { String.class, String.class, String.class , String.class});
		// 使用有参数的构造方法实例对象
		Object obj = cons.newInstance(new Object[] {"1" , "2" , "3" , "4"});
		// 转换为实际操作类
		Person personObj = (Person) obj;
		person.getNameDefault();

	}
}
