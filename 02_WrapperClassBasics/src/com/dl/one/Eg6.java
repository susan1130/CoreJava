package com.dl.one;

public class Eg6 {

	public static void main(String[] args) {
		// String type to object type
		String s = "10";
		
		//Using parameterised constructor
		Integer i1 = new Integer(s);
		System.out.println("Parameterised constructor: "+i1);
		
		// using valueOf()
		Integer i2 = Integer.valueOf(s);
		System.out.println("Using valueOf() method: "+i2);
		
		//Object type to String type
		
		Integer ii = new Integer(100);
		//using toString() method
		String ss1 = ii.toString();
		System.out.println("Using toString() method: "+ss1);
		//using + operator
		String ss2 = ""+ii;
		System.out.println("Using + operator: "+ss2);

	}

}
