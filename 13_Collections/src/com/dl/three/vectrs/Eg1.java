package com.dl.three.vectrs;

import java.util.Vector;
//Vectors are synchronised. Legacy 
public class Eg1 {

	public static void main(String[] args) {
		
		Vector<String> v = new Vector<String>();
		v.add("IndexZero");
		v.add("IndexOne");
		v.add("IndexTwo");
		v.add("IndexThree");
		v.add("IndexFour");
		v.add("IndexFive");
		v.add(null);
		System.out.println("Vectors are: "+v);
		
		System.out.println("   ....  ");
		
		Vector<String> v1 = new Vector<String>(v);
		v1.add("A");
		v1.add("B");
		v1.add("C");
		v1.add("D");
		System.out.println("Results of parameterised vector is: "+v1);
		
		System.out.println("     ....     ");
		System.out.println("First element is: "+v1.firstElement());
		System.out.println("Last element is: "+v1.lastElement());
		
	}

}
