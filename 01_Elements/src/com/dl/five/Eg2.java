package com.dl.five;

public class Eg2 {

	//Static Variables
	static int a = 11;
	static int b = 12;
	
	public static void main(String[] args) {
	
		m1();
		Eg2.m1();
		System.out.println("Main method");
		System.out.println(a);
		System.out.println(b);
	}

	//Static Method
	public static void m1() {
		System.out.println("Static method");
		System.out.println(a+1);
		System.out.println(b+1);
	}
	
	//static block
	static {
		System.out.println("Static block");
		System.out.println(a+2);
		System.out.println(b+2);
	}
}
