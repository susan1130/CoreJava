package com.dl.one;

//Note that instances of functional interfaces can be created with lambda expressions, method references, or constructor references. 

@FunctionalInterface
interface Addition{
	
	void sum(int a, int b);
}

public class Eg3 {

	public static void main(String[] args) {

		Addition a = (x,y) -> System.out.println("Sum of both values is: " +(x+y));
		a.sum(33, 11);
	}

}
