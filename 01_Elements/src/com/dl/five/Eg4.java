package com.dl.five;

public class Eg4 {

	//scope of the local variable in the instance block => only visible within the block
	//Cannot be accessed in main method
	public static void main(String[] args) {
		
		new Eg4();
	}

	//instance block
	{
		int a = 10;
		//System.out.println(a);
	}
	

}
