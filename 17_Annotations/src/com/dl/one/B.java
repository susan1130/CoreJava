package com.dl.one;

public class B extends A {

	@Deprecated
	public void m3() {
		System.out.println("M3 method");
	}
	
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
		B b = new B();
		b.m1();
		b.m2();
		b.m3();
	}

}


//@deprecated and @SuppressWarnings