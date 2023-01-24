package com.dl.one;

//Lambda interface:  makes the many similar lines of code shorter.

//Instances of functional interfaces can be created with lambda expressions, method references, or constructor references

@FunctionalInterface
interface Add{
	void m1() ;
}

public class Eg5 {
	
	int a;
	int b;
	
	public Eg5(int a, int b) {
		this.a = a;
		this.b = b;
	}

	public static void main(String[] args) {
		
		new Eg5(150,10).sum(); 
	}
	
	public void sum() {
		
		Add aa =() ->{
			System.out.println(a+b);
		};
		aa.m1();
	}

}
