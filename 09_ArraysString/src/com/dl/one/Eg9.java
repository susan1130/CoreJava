package com.dl.one;

public class Eg9 {

	public static void main(String[] args) {
		
		// indexOf()  Returns the index within this string of the first occurrence of the specified substring, starting at the specified index
		
		String s1 = "A quick running a fox jumped over a lazy dog";
		String s2 = "lazy";
		System.out.println(s1.indexOf("f")); 
		System.out.println(s1.indexOf("jumped"));
		System.out.println(s1.indexOf(s2));
		
		System.out.println(s1.indexOf("a", 17));  //Returns the index within this string of the first occurrence of the specified substring, starting at the specified index. 
		// This gives the index of the string when it occurs after the specified offset
	}

}
