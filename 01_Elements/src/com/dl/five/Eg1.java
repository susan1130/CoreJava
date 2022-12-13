package com.dl.five;

public class Eg1 {

	//Instance Variable
	int a = 100;
	int b = 1000;
	
	public static void main(String[] args) {
		
		//new Eg1();
		new Eg1().m1();

	}

	// Instance method
	public void m1() {
		System.out.println("Instance Method");
		System.out.println(a);
		System.out.println(b);
	}
	
	//Instance Block
	{
		System.out.println("Instance Block");
		System.out.println(a+1);
		System.out.println(b+1);
	}
	
	// Constructor
	public Eg1(){
		System.out.println("Constructor");
		System.out.println(a+2);
		System.out.println(b+2);
	}
}
