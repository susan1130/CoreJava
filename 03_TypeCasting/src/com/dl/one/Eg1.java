package com.dl.one;

public class Eg1 {

	//Implicit Type Casting
	// Byte-- Short-- Integer-- Long-- Float-- Double
	//--------------- Character
	
	// The above is the hierarchy for implicit type casting
	
	public static void main(String[] args) {
		
		byte b1 = 10;
		short s1 = b1;
		System.out.println(s1);
		
		short s2 = 20;
		int i1 = s2;
		System.out.println(i1);
		
		int i2 = 30;
		long l1 = i2;
		System.out.println(l1);
		
		long l2 = 40;
		float f1 = l2;
		System.out.println(f1);
		
		float f2 = 50f;
		double d1 = f2;
		System.out.println(d1);
		
		char c1 = 'S';
		int i3 = c1;
		System.out.println(i3);
	}

}
