package com.dl.two.array;

public class Eg7 {

	public static void main(String[] args) {
		
//		int a[] = new int [-4];		//java.lang.NegativeArraySizeException:  
//		a[-2] = 10;					//Array size can never be negative
//		a[-3] = 20;
//		System.out.println(a[-2]);
//		System.out.println(a[-3]);

		int a[] = new int[0];
		System.out.println(a);
		a[0] = 10;
		System.out.println(a[0]);  // Index 0 out of bounds for length 0 error
	}

}
