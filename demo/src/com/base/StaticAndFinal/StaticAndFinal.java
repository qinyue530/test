package com.base.StaticAndFinal;

public class StaticAndFinal {
	public static int s = 100;
	public final int f = 100;
	public  static final int  sf = 100;
	public static void sget() {
		System.out.println("sget  s = " + s);
	}
	public final void fget() {
		System.out.println("fget f = " + f);
	}
	public static final void sfget() {
		System.out.println("sfget sf = " + sf);
	}
	public void test() {
		System.out.println("test");
	}
	public static void main(String args[]) {
		StaticAndFinal hs1 = new StaticAndFinal(){
/*
 * 		Staic 方法 可以被继承		不能被重写
 * 		fianl 方法不能被继承 		不能被重写
 */
//			public static void sget() {
//				System.out.println("hs1  sget !!!");
//			}
//			public final void fget() {
//				System.out.println("hs1 fget !!!");
//			}
			public void test() {
				System.out.println("hs1 test");
			}
		};
		hs1.test();
		hs1.fget();
		hs1.sget();
		hs1.s++;
		StaticAndFinal hs2 = new StaticAndFinal();
		hs1.sget();
		hs2.s++;
		hs1 = new StaticAndFinal();
		hs1.sget();
		hs1.s++;
		System.out.println("x = " + s);
		StaticAndFinal.s--;
		System.out.println("x = " + s);
		sfget();
	}
}

/*
Static关键字（静态）

1. static 静态方法
其实就是没有this的类方法，在他的内部不能调用非静态方法和非静态变量，但是非静态方法可以调用静态方法，可以在没有创建类的条件下，直接通过类的本身调用静态方法，其实类的构造器就是static方法。

2.Static变量
Static变量是内存共享的，所有对象共享一个变量，是在类的初始化的时候加载的，只被初始化一次，static成员变量初始化的顺序是按照定义的初始化顺序加载的，不允许修饰局部变量，
static变量不会影响到变量的作用域，访问权限由private、public、proteced决定。Static变量可以通过this.valName访问。

3.Static类
只有内部类才能使用

Final的作用：

   同样，final的作用从变量、方法、类三个方面来理解、
      final修饰的变量的值不能被修改，是一个常量；
      final修饰的方法不能被重写；
      final修饰的类不能被继承；
final 和static 一块用表示什么？

static final和final static没什么区别，一般static写在前面。

    static和final一块修饰的成员变量和成员方法，简单来说可以理解为全局变量！

   对于变量，一旦给定值，就不可以修改，并且通过类名可以访问。

   对于方法，表示不可覆盖，并且可以通过类名直接访问。
   
static final：

static修饰的属性强调它们只有一个，final修饰的属性表明是一个常数（创建后不能被修改）。static final修饰的属性表示一旦给值，就不可修改，并且可以通过类名访问。

static final也可以修饰方法，表示该方法不能重写，可以在不new对象的情况下调用

*/