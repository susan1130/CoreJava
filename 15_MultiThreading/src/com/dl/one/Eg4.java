package com.dl.one;

public class Eg4 extends Thread {

	public static void main(String[] args) {
		
		Eg4 e = new Eg4();
		
		System.out.println(e.getName());
		
		Thread.currentThread().setName("Custom thread");
		System.out.println(Thread.currentThread().getName());

	}

}
