package com.dl.two;

public class Profile {

	public void m1() {
		this.m2(); // the m2 method can be called like this
		m3();		// same as this.m3();
		System.out.println("Inside M1 method");
		
	}
	
	public void m2() {
		System.out.println("Inside M2 method");
	}
	
	public void m3() {
		System.out.println("Inside M3 method");
	}
	
	public static void main(String[] args) {
		
		Profile pro = new Profile();
		pro.m1();

	}

}
