package com.dl.inheritance.three;

public class Child extends Parent {

	public void m4() {
		System.out.println("Method m4 in the Child Class");
	}

	public static void main(String[] args) {
		Child ch = new Child();
		ch.m1();
		System.out.println("Method m2 in GrandParent Class returns: "+ch.m2());;
		ch.m3();
		ch.m4();
	}

}
