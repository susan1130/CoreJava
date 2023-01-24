package com.dl.one;

interface AA{
	default void m1() {
		System.out.println("Default Method");
	}
}

public class Eg12 implements AA{

	public static void main(String[] args) {
		
		AA a = new Eg12();
		a.m1();
	}

}
