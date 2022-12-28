package com.dl.one;

public class Eg8 {

	public static void main(String[] args) {
		
		String s1 = "Hello world ! Though it's too late for hello world examples";
		
		System.out.println(s1.startsWith("He")); // Tests if this string starts with the specified prefix.
		System.out.println(s1.endsWith("es"));   //Tests if this string ends with the specified prefix.
		
		String s2 = "Java";
		String s3 = "PYTHON";
		System.out.println(s2.toUpperCase());	// changes everything to upper case
		System.out.println(s3.toLowerCase());   // Changes everything to lower case
	}

}
