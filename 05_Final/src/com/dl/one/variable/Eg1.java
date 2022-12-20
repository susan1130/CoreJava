package com.dl.one.variable;

public class Eg1 {
	
	// using the final key means the value cant't be changed 
	public static void main(String[] args) {
		final int i = 100;
		System.out.println(i);
		//i--;     
		//The final local variable i cannot be assigned. It must be blank and not using a compound assignment
	}

}
