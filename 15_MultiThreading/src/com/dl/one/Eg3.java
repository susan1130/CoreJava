package com.dl.one;

public class Eg3 implements Runnable{

	public static void main(String[] args) {
		
		Eg3 e = new Eg3();
		
		Thread t1 = new Thread(e);
		t1.start();
		
		Thread t2 = new Thread(e);
		t2.start();
		
		Thread t3 = new Thread(e);
		t3.start();

	}

	@Override
	public void run() {

		System.out.println("Run method");
		
	}

}
