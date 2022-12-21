package com.dl.one;

import java.util.Scanner;

public class Eg1 {
	//if else, else if, else control statement
	public static void main(String[] args) {
		
		System.out.println("Let's see if you can guess a no bigger than mine");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number: ");
		int a = sc.nextInt();
		
		int myNo = 10000;
		
		if (a<myNo) {
			System.out.println("Your no is lesser than mine");
		}
		else if  (a>myNo){
			System.out.println("Your no is greater than mine");
		}
		else {
			System.out.println("Our nos are equal");
		}
		sc.close();
	}

}
