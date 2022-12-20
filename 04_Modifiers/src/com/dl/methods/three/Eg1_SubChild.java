package com.dl.methods.three;

import com.dl.three.Eg1_Parent;
import com.dl.three.Eg2_Child;

// Scope of the modifiers in another package after import

public class Eg1_SubChild extends Eg2_Child{

	public static void main(String[] args) {
		Eg1_Parent p1 = new Eg1_Parent();
		
		p1.m1();
		System.out.println("Using the Parent Class object means only the public method gets accessed");
	
		
		Eg2_Child ch = new Eg2_Child();
		ch.m1();
		System.out.println("Using the Child Class object means only the public method gets accessed");
		
		Eg1_SubChild sch = new Eg1_SubChild();
		sch.m1();
		sch.m2();
		System.out.println("Using the Sub-child Class object means u can access the protected and public methods");
	}

}
