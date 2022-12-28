package com.dl.two.array;

public class Eg4 {

	public static void main(String[] args) {
		
		int a[] = {11,12,13,14,15};
		int i = 0;
		
		System.out.println("while loop");
		while(i<5) {
			System.out.println(a[i]);
			i++;
		}
		
		i = 0;
		
		System.out.println("do while loop");
		do {
			System.out.println(a[i]);
			i++;
		}while(i<5);

	}

}