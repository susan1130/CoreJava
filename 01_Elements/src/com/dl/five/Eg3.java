package com.dl.five;

public class Eg3 {
//Instance and static blocks and methods
	public static void main(String[] args) {
		m2();
		new Eg3().m1();
	}
	// Instance Method
	public void m1() {
		int a = 10;
		int b = 20;
		System.out.println("instance method");
		System.out.println(a);
		System.out.println(b);
	}
	//Static Method
	public static void m2() {
		int c = 30;
		int d = 40;
		System.out.println("static method");
		System.out.println(c);
		System.out.println(d);
	}
	//instance block
	{
		int e = 100;
		int f = 200;
		System.out.println("instance block");
		System.out.println(e);
		System.out.println(f);
	}
	//static block
	static {
		int g = 300;
		int h = 400;
		System.out.println("static block");
		System.out.println(g);
		System.out.println(h);
	}
}
