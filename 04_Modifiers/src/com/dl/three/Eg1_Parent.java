package com.dl.three;

public class Eg1_Parent {

	//Parent class it has access to all the methods. The Private method can only be accessed here. No child inherits it
	public static void main(String[] args) {
		Eg1_Parent parent = new Eg1_Parent();
		parent.m1();
		parent.m2();
		parent.m3();
		parent.m4();
	}
	
	//public
	public void m1() {
		System.out.println("Public Method");
	}
	
	//protected
	protected void m2() {
		System.out.println("Protected Method");
	}
	
	//private
	private void m3() {
		System.out.println("Private Method");
	}
	
	//default
	void m4() {
		System.out.println("Default Method");
	}
}
