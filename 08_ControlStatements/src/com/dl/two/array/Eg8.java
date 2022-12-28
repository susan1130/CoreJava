package com.dl.two.array;

public class Eg8 {

	public static void main(String[] args) {
		// int array : mutable i.e. can be changed
		
		int a[] = {10,20,30,40};
		a[0] = 100;
		a[1] = 200;
		a[2] = 300;
		a[3] = 400;
		
		for(int i = 0; i<4; i++) {
			System.out.println(a[i]);
		}

		//char/string arrays are immutable ,i.e. cannot be changed
		char b[] = {'j','a','v','a'};
		System.out.println(b);
		System.out.println(b.length);
		
		//Strings : immutable
		String s = "python";
		System.out.println(s.length());
		System.out.println(s);
	}

}
