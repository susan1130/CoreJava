package com.dl.polymorphism.overloading.one;

public class Eg3 {
	
	public Eg3() {
		System.out.println("Default Constructor 1 ");
	}
	public Eg3(int a,int b) {
		System.out.println("Default Constructor 2 "+a+" "+b);
	}
	public Eg3(float a,float b) {
		System.out.println("Default Constructor 3 "+a+" "+b);
	}
	public static void main(String[] args) {
		
		//Constructor overloading
		//Eg3 e = new Eg3();//cant use this since these are constructors and not methods
		//e.Eg3();
		new Eg3();
		new Eg3(10,20);
		new Eg3(22.3f,11.2f);
	}

}
