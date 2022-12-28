package com.dl.two.array;

import java.util.Arrays;

public class Eg12 {

	public static void main(String[] args) {
		
		int a[] = {10, 20, 30, 40};
		System.out.println(Arrays.toString(a));		// using Arrays.toString() to display the array
		
		int b[] = new int[4];
		Arrays.fill(b, 10);
		System.out.println(Arrays.toString(b));		//using Arrays.fill() to fill the array
		
		int c[] = {9,6,3,1};
		Arrays.sort(c);								//sorting an array using Arrays.sort()
		System.out.println(Arrays.toString(c));
		
		String s[] = {"Z","p","D","a"};
 		Arrays.sort(s);								// sorting a string array
 		System.out.println(Arrays.toString(s));
		
 		int s1[] = {1,3,5};
 		int s2[] = {1,3,5};
 		System.out.println(Arrays.equals(s1, s2));	// using Arrays.equals method to compare 2 arrays -> returns true

	}

}
