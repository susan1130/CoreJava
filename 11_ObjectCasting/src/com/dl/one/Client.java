package com.dl.one;

class A {
	public A(){
		System.out.println("Cons A");
	}
}

class B extends A{
	public B(){
		System.out.println("Cons B");
	}
	public void m1() {
		System.out.println("Method");
	}
}

public class Client {

	public static void main(String[] args) {
		
		//B b = new B();
		//Cons A
		//Cons B
		
//		A a = new A();
//		B b = (B)a;			//Cannot cast from A to B
		
//		A a = new A();
//		B b = (B) a;
//		b.m1();					class com.dl.one.A cannot be cast to class com.dl.one.B
		
		A a = new B();
		B b = (B) a;
		b.m1();
	}

}
