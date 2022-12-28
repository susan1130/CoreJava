package com.dl.one;

public class Eg3 {

	public static void main(String[] args) {
		
		//Strings are Immutable
		
		String s1 = "Java"; //SCP
		String s2 = s1.concat(s1);	//Heap area	// when you concatenate, you get a new string, so no sharing
		System.out.println(s1 == s2);		//false
		System.out.println(s1.equals(s2));	//false
		
		String s3 = new String("Python");  //heap area
		String s4 = s3.concat("Python");	//heap area
		System.out.println(s3 == s4);  // false
		System.out.println(s3.equals(s4));		//false
		
	}

}
