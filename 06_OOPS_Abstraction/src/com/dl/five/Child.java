package com.dl.five;

public class Child extends Parent {

	@Override
	public void m2() {
		System.out.println("M2 method");

	}

	@Override
	public void m3() {
		System.out.println("M3 method");

	}

	@Override
	public void m4() {
		System.out.println("M4 method");

	}

	@Override
	public void m5() {
		System.out.println("M5 method");

	}
	public static void main(String[] args) {
		
		Child c = new Child();
		c.m1();
		c.m2();
		c.m3();
		c.m4();
		c.m5();
	}

}
