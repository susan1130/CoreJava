package com.dl.one;
//Use of super keyword
class Parent{
	int i = 10;
	int j = 20;
}

class Child extends Parent{
	int i = 100;
	int j = 200;
	public void m1() {
		int i = 1000;
		int j = 2000;
		System.out.println("Local value of i in m1 method: "+i);
		System.out.println("Local value of j in m1 method: "+j);
		
		System.out.println("Value of i in Parent: "+super.i);
		System.out.println("Value of j in Parent: "+super.j);
	}
}

public class Client {

	public static void main(String[] args) {
		
		Child c = new Child();
		System.out.println("Value of i in Instance of the child class: "+c.i);
		System.out.println("Value of j in Instance of the child class: "+c.j);
		c.m1();

	}

}
