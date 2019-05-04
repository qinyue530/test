package com.base.AbstractAndInterFace;
/*
## Java 程序初始化顺序
父类静态变量 -> 父类静态代码块 -> 子类静态变量 -> 子类静态代码块 -> 
父类非静态变量 -> 父类非静态代码块 -> 父类构造函数 -> 
子类非静态变量 -> 子类非静态代码块 -> 子类构造函数
 */
class Base {
    static {
        System.out.println("Base static block");
    }

    {
        System.out.println("Base block");
    }

    public Base() {
        System.out.println("Base constructor");
    }
}
class AAA extends Base{
    static {
        System.out.println("AAA static block");
    }

    {
        System.out.println("AAA block");
    }

    public AAA() {
        System.out.println("AAA constructor");
    }
}
class BBB extends AAA{
    static {
        System.out.println("BBB static block");
    }

    {
        System.out.println("BBB block");
    }

    public BBB() {
        System.out.println("BBB constructor");
    }
}
class CCC extends AAA{
    static {
        System.out.println("CCC static block");
    }

    {
        System.out.println("CCC block");
    }

    public CCC() {
        System.out.println("CCC constructor");
    }
}
public class Derived {

    public static void main(String[] args) {
    	AAA a = new AAA();
    }
}