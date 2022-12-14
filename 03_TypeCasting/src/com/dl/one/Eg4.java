package com.dl.one;

public class Eg4 {

	public static void main(String[] args) {
		
		Integer i1 = 10;				// Wrapper class
		int i2 = 20;					// primitive data type
		System.out.println(i1+i2);      // implicit casting done by compiler
		
		Double d1 = 10d;
		double d2 = 20;
		byte b1 = (byte) (d1+d2);
		System.out.println(b1);
		
		//Integer ii = new Integer(10);   // The constructor Integer is deprecated and marked for removal since java 9 
		Integer i3 = 10;
		int i4 = i3;
		System.out.println(i4);
		
		
		
	}

}
