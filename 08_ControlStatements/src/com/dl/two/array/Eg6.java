package com.dl.two.array;

public class Eg6 {
//for each loop
	static final int a[] = new int [5];
	
	public static void main(String[] args) {
		
		for (int i = 0; i < a.length; i++) {		//load all the elements and increment
			System.out.println(a[i]);
		}
		
		for (int i = 0; i < 5; i++) {
			System.out.println(a[i]);              //load all the elements based on condition, increment
		}

		//for each loop
		
		for(int j : a ) {
			System.out.println(j);
		}
	}

}
