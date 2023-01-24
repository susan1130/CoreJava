package com.dl.one;

public class Eg2 extends Thread {

	public static void main(String[] args) {
		
		Eg2 e = new Eg2();
		e.start();

	}
	public void run() {
		System.out.println("Run method");
	}
}
