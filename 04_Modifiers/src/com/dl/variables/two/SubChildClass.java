package com.dl.variables.two;

import com.dl.variables.one.Child; // importing child class from another package 

public class SubChildClass extends Child{

	public static void main(String[] args) {
		
		//SubChildClass sub = new SubChildClass();   // this is not needed
		System.out.println(userName);			//protected variable of Child() class
		System.out.println(userContactNo);		//public variable of Child() class
		
		System.out.println(new Child().userContactNo);
		System.out.println(new SubChildClass().userName);

	}

}
