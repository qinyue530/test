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
