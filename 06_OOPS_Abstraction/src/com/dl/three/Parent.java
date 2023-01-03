package com.dl.three;

public abstract class Parent {

	
	int a = 10;
	int b = 20;
	
	static int c = 30;
	static int d = 40;
	
	public static void main(String[] args) {
	
		int e = 50;
		int f = 60;
		
		System.out.println("Local Variables: "+e+" "+f);
		
		//System.out.println("Instance Variables: "+a+" "+b);
		//cant call the instance variables here like this
		
		System.out.println("Static Variables: "+c+" "+d);

	}

}
