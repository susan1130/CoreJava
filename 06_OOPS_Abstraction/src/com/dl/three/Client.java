package com.dl.three;

//Client extends the abstract Parent class, and can access its instance variables, along with other things

public class Client extends Parent{
	
	public static void main(String[] args) {
		System.out.println("Instance variable from the abstract method: "+new Client().a);
		System.out.println("Instance variable from the abstract method: "+new Client().b);
		
	}
}
