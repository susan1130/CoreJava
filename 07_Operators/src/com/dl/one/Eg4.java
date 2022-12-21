package com.dl.one;
import java.util.Scanner;
//comparision operators
public class Eg4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a no: ");
		int a = sc.nextInt();
		System.out.println("Enter a no: ");
		int b = sc.nextInt();
		
		System.out.println(a == b);			
		System.out.println(a <= b);
		System.out.println(a >= b);
		System.out.println(a != b);
		System.out.println(a < b);
		System.out.println(a > b);
		
		sc.close();

	}

}
