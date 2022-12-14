package com.dl.variables.one;

public class Child extends Parent{

	public static void main(String[] args) {
		
		//System.out.println(userId);		private modifiers cannot be called into child classes
		System.out.println(userName);
		System.out.println(userContactNo);
		System.out.println(salary);

	}

}
