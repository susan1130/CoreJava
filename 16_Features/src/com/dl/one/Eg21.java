package com.dl.one;

public class Eg21 {

	public static void main(String[] args) {
		
		add();				// static function call					//120
		Eg21.add();			// Constructor function call			//120
		
		Thread t = new Thread(Eg21 :: add);			//parameterised function call using thread
		t.start();													//120
		
		Thread t1 = new Thread(() -> add());		//using thread, lambda function call
		t1.start();													//120

	}
	
	public static void add() {
		int a = 20, b = 100;
		System.out.println(a+b);
	}
}
