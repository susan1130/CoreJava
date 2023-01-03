package com.dl.six;

public class ProfileImpl extends ProfileTwo implements ProfileOne {

	@Override
	public void m1() {
		System.out.println("M1 Method");
	}

	@Override
	public void m2() {
		System.out.println("M2 Method");
		
	}

}
