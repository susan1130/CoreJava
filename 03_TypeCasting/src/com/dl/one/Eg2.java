package com.dl.one;

public class Eg2 {

	//Explicit Type Casting
	// Double-- Float-- Long-- Integer-- Short-- Byte
	//------------------------ Character
	
	// The above is the hierarchy for explicit type casting
	
	public static void main(String[] args) {
		
		double d1 = 100f;
		float f1 = (float) d1;
		System.out.println(f1);
		
		float f2 = 200f;
		long l1 = (long) f2;
		System.out.println(l1);
		
		long l2 = 300;
		int i1 = (int) l2;
		System.out.println(i1);
		
		int i2 = 400;
		short s1 = (short) i2;
		System.out.println(s1);
		
		short s2 = 500;
		byte b1 = (byte) s2;
		System.out.println(b1);
		
		int i3 = 74;
		char c1 = (char) i3;
		System.out.println(c1);
	}

}
