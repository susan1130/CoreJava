package com.dl.one;

import java.util.Scanner;

public class Eg2 {
	// Arithmetic operators += -= *= /= %=
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a value");
		int a = sc.nextInt();
		System.out.println("Enter a value");
		int b = sc.nextInt();
		
		System.out.println(a += b);			// same as a=a+b
		System.out.println(a -= b);
		System.out.println(a *= b);
		System.out.println(a /= b);
		System.out.println(a %= b);
		
		sc.close();

	}

}
