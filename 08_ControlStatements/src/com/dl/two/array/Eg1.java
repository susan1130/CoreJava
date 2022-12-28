package com.dl.two.array;

public class Eg1 {

	int a[] ;
	static int b[] = {1,2,3} ;
	public static void main(String[] args) {
		
		System.out.println(new Eg1().a);
		System.out.println(b);//If left uninitialise this gives null, else it gives the address of the array

	}

}
