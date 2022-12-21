package com.dl.one;

import java.util.Scanner;

public class Eg3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a no: ");
		int a = sc.nextInt();
		
		System.out.println(a++);
		System.out.println(a);
		System.out.println(++a);

	}

}
