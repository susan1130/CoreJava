package com.dl.three;

class Parent{
	public Parent() {
		System.out.println("Default Cons in Parent");
	}
	public Parent(int i) {		//parameterised constructor
		this(); 	//calls current class
		System.out.println("Value is: "+i);
	}
}

class Child extends Parent{
	public Child() {
		super(10);		//calls parent class
		System.out.println("Default Cons in Child");
	}
}

public class Client {

	public static void main(String[] args) {

		new Child();

	}

}
