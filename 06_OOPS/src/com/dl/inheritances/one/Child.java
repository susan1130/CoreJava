package com.dl.inheritances.one;

// Single Level Inheritance

class Parent{
		public void m1() {
			System.out.println("Method m1 of parent");
		}
		
		public static void m2() {
			System.out.println("Method m2 of parent");
		}
}
//Inheriting  >>>> extends keyword  >>>>> data and methods from the parent class can be used in the child class

public class Child extends Parent{
	public static void main(String[] args) {
		Child ch = new Child();
		ch.m1();
		m2();
		}

}
