package com.dl.one;

import java.util.Scanner;

public class Eg2 {

	public static void main(String[] args) {
		
		//switch case
		
		System.out.println("Enter a choice between 1 to 5");
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		switch (a) {
		case 1: 
			System.out.println("You have won a Chicken Dinner");
			break;
		case 2: 
			System.out.println("You have won a Seafood Dinner");
			break;
		case 3: 
			System.out.println("You have won a Pasta Alfredo Dinner");
			break;
		case 4: 
			System.out.println("You have won a Gourmet Dinner");
			break;
		case 5: 
			System.out.println("You have won a Turkey Dinner");
			break;
			
		default:
			System.out.println("Wrong input. You just lost a dinner");
			break;
		}
		
		sc.close();
		

	}

}
