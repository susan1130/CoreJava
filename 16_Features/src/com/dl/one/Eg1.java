package com.dl.one;

public class Eg1 {

	static int x = 51;
	int y = 22;
	
	public static void main(String[] args) {
		
		int a = 15, b = 29;
		System.out.println("Variable in main section: "+a);
		System.out.println("Variable in main section: "+b);
		
		System.out.println("Variable in static section: "+x);
		System.out.println("Variable in instance section: "+ new Eg1().y);

	}

}
