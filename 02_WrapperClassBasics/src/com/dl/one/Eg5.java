package com.dl.one;

public class Eg5 {
	// conversion of primitive data type to object type
	public static void main(String[] args) {
		
		int i = 100;
		
		System.out.println("Conversion of primitive data type to object type");
		//3 ways
		Integer i2 = new Integer(i);
		System.out.println("Using parameterised Constructor: "+i2);
		
		Integer i3 = Integer.valueOf(i);
		System.out.println("Using valueOf() method: "+i3);
		
		Integer i4 = i;
		System.out.println("autoboxing: "+i4);
		
		System.out.println("Conversion of Obj type data to primitive type");
		//2 ways
		Integer ii=new Integer(1000);
		int ii1 = ii.intValue();
		System.out.println("Using intValue() method: "+ii1);
		
		int ii2 = ii;
		System.out.println("Auto-unboxing: "+ii2);
		
	}

}
