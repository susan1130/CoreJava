package com.dl.two.array;

public class Eg5 {

	public static void main(String[] args) {
		
		int a[] = { 10/2, (int)20.22, 30*2, 21%2, (int)122.342, 22+31, 20-10};
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		
		//for each loop
		for(int j : a ) {
			System.out.println(j);
		}
	}
}
