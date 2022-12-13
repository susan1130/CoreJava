package com.dl.two.methods;

public class Eg1 {

	public static void main(String[] args) {
	
		m1();	//direct method
		m2();	//direct method
		Eg1.m3();	//Classname.staticMethodName()
		Eg1.m4();	//Classname.staticMethodName()
	}

	//static methods
	public static void m1() {
		System.out.println("Method 1");
	}
	public static void m2() {
		System.out.println("Method 2");
	}
	public static void m3() {
		System.out.println("Method 3");
	}
	public static void m4() {
		System.out.println("Method 4");
	}
}
