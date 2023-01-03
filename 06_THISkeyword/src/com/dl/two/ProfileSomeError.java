package com.dl.two;

public class ProfileSomeError {

	public void m1() {
		this.m1();
		System.out.println("inside m1 method");
	}
	public static void main(String[] args) {
		
		ProfileSomeError p = new ProfileSomeError();
		p.m1();

	}

}

// cant use this.functionName for a function. Leads to StackOverFlowError 