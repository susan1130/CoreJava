package com.dl.one;

interface BB{
	default void m1() {
		System.out.println("Default M1 method");
	}
}

public class Eg13 implements BB{

	public void m1() {
		System.out.println("M1 method in instance of Eg13");
	}
	
	public static void main(String[] args) {
		
		BB b = new Eg13();
		b.m1();

	}

}
