package com.dl.one;

import java.util.Scanner;

public class Eg1 {

	public static void main(String[] args) {
		//OOPS concepts
		
		/*Object is the instance of a class
		 * Obj >>>> contains >>>> State and Behaviour
		 * Eg: Bike => STATE: color, cc, brand, etc   BEHAVIOUR: runs on petrol/ diesel, can run on road
		 * DIFFERENCE between: IS-A  and   HAS-A  (data member)*/
		
		// Abstraction: Data hiding. Abstract method
		// Encapsulation: Wrapping data, public methods and private properties. Setters and getters
		// Inheritance: Acquiring properties. Single, multiple, multilevel, hierarchical and hybrid 
		// Polymorphism: Many forms. Method overloading, method overwriting.
		
		Scanner sc = new Scanner(System.in);   // needs package java.util.Scanner
		System.out.println("Enter a number: ");
		int i = sc.nextInt();
		System.out.println("Scanned input is : "+i);
		
		System.out.println("Enter another no: ");
		int i1 = sc.nextInt();
		System.out.println("Scanned input is : "+i1);
		
		System.out.println("Addtion results are : "+(i+i1));
		sc.close();
	}

}
