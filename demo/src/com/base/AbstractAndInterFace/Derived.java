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

public class Derived extends Base {
    static {
        System.out.println("Derived static block");
    }

    {
        System.out.println("Derived block");
    }

    public Derived() {
        System.out.println("Derived constructor");
    }

    public static void main(String[] args) {
        new Derived();
    }
}