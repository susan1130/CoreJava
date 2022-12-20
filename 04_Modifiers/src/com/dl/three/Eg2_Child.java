package com.dl.three;

public class Eg2_Child extends Eg1_Parent{

	// Child class extends/ inherits the parent class. Private Method can't be accessed here. 
	public static void main(String[] args) {
		
		Eg2_Child child = new Eg2_Child();
		child.m1();
		child.m2();
		child.m4();
	}

}
