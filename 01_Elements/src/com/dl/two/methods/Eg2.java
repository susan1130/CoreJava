package com.dl.two.methods;

public class Eg2 {

	public static void main(String[] args) {
		
		Eg2 eg2= new Eg2();		// object of Eg2 created
		
		eg2.m1();	//ObjectReference.InstanceMethod() 
		eg2.m2();	//ObjectReference.InstanceMethod()
		
		System.out.println(" ");
		
		new Eg2().m3();		//new ClassName().instanceMethod()
		new Eg2().m4();		//new ClassName().instanceMethod()
	}
	
	//Non Static Methods/ Instance Method
	
	public void m1() {
		System.out.println("Method 1");
	}
	public void m2() {
		System.out.println("Method 2");
	}
	public void m3() {
		System.out.println("Method 3");
	}
	public void m4() {
		System.out.println("Method 4");
	}
}
