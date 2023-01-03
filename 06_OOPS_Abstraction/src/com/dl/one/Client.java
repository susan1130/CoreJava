package com.dl.one;

//How to define an abstract class and abstract methods in the same class

abstract class Parent{
	public void m1() {
		
		System.out.println("Normal method in an abstract calss");
	}
	public abstract void m2() ;
}

class Child extends Parent{
	
	@Override
	public void m2() {
		System.out.println("The abstract method declared in Parent is defined in Child class");
		
	}
}

public class Client {

	public static void main(String[] args) {
		Child c = new Child();
		c.m1();
		c.m2();
		
		Parent p = new Child();
		p.m1();
		p.m2();
	}
}
