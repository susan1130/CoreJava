package com.dl.one;

public class Eg7 {

	public static void main(String[] args) {

		//Primitive type to String type
		
		int a = 10;
		
		String s1 = Integer.toString(a);
		System.out.println("Using toString() method: "+s1);
		
		String s2 = ""+a;
		System.out.println("Using + operator: "+s2);
		
		//String type to primitive type
		String b = "74";
		
		int ii = Integer.parseInt(b);
		System.out.println("Using Integer.parseInt() method: "+ii);
	}

}
