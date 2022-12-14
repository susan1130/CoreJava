package com.dl.one;

public class Eg3 {

	// Another typecasting eg
	
	public static void main(String[] args) {
		
		byte b1 = 10;
		long l1 = b1;
		System.out.println(l1);  // implicit type casting byte -> long
		
		long l2 = 20;
		byte b2 = (byte)(short)(int)(long)(float)(double)l2;
		System.out.println(b2);  //  explicit type casting  long -> byte ??
		
		int i1 = 30;
		int i2 = 40;
		long l3 =  i1+i2;
		System.out.println(l3);	 // implicit type casting  int -> long  with an addition
		
		float f1 = 50f;
		int i3 = (int) f1;
		System.out.println(i3);	 // explicit type casting float -> int
		
		int i4 = 60;
		short s1 = (byte) i4;
		System.out.println(s1);  // both explicit and implicit type casting int->byte -> short 
		
		float f2 = 70f;
		double d1 = (long) f2;
		System.out.println(d1);  // float-> long -> double
		
		int ii = 2000;
		byte bb = (byte) ii;
		System.out.println(bb);

	}

}
