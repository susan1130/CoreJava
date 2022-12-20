package com.dl.two.methods;

public class Eg2_Child extends Eg1_Parent {

	// Child is calling the public method of the Parent Class
	
	public static void main(String[] args) {
		
		Eg1_Parent p = new Eg2_Child();
		p.m1();
		new Eg1_Parent().m1();

	}
	
	public void m1() {
		int houseNo = 326;
		System.out.println("public method of Child Class "+houseNo);
	}

}
