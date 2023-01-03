package com.dl.six;



public class Child extends Parent{

	public static void main(String[] args) {
		Child c = new Child();
		c.m1();
		c.m2();
		c.m3();
		c.m4();
	}
	@Override
	public void m3() {
		System.out.println("M3 Method");
	}
	
	@Override
	public void m4() {
		System.out.println("M4 method");
	}
}
