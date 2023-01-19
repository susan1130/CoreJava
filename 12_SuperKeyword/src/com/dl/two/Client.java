package com.dl.two;

class Parent{
	public void m1() {
		System.out.println("Inside m1 method of Parent Class");
	}
}

class Child extends Parent{
	public void m1() {
		System.out.println("Inside m1 Method of Child Class");
	}
	public void m2() {
		this.m1();
		System.out.println("Inside m2 Method of Child Class");
		super.m1();
	}
}

public class Client {

	public static void main(String[] args) {
		
		Child c = new Child();
		c.m2();

	}

}
