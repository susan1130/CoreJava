package com.dl.two.array;

import java.util.Scanner;

public class Eg3 {
	

	public static void main(String[] args) {
//type casting in array		
		int a[] = {10,(int)11.0,(int)8.4,9,0};
		System.out.println(a);
		
		for (int i = 0; i < 5; i++) {
			System.out.println(i+" array element: "+ a[i]);
		}
	
		System.out.println(" 		------------------------------------- 		");
// Scanner method to populate an array
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter length of array: ");
		int b = sc.nextInt();
		int arr[] = new int[b];
		
		int c;
		
		for (int j = 0; j < b; j++) {
			System.out.println("Enter the array element: ");
			c = sc.nextInt();
			arr[j] = c;
			System.out.println(j+" array element: "+ arr[j]);
		}
		
		System.out.println("The array elements are: ");
		
		for (int k = 0; k < b; k++) {
			System.out.println(k+" array element: "+ arr[k]);
		}
		
		sc.close();
	}

}

