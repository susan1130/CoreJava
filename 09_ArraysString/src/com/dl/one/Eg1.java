package com.dl.one;

import java.util.Arrays;

public class Eg1 {

	public static void main(String[] args) {
		//using the Arrays.toString method to display the character array and .length to find length
		char c[] = {'H','e','l','l','o',' ','W','o','r','l','d'};
		System.out.println(Arrays.toString(c));  
		System.out.println(c.length);
		
		//For a string, the working is slightly different
		//though the functions used here are .length() and .toString() 
		String s = "FullStack Java";
		System.out.println(s.length());
		System.out.println(s.toString());

	}

}
