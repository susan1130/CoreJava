package com.dl.one;

public class Eg6 {
//Since Thread is written in Native language, its behaviour is unpredictable 
	public static void main(String[] args) {

		Thread t1 = new Thread();
		t1.start();
		System.out.println(t1.isAlive());
		
		Thread t2 = new Thread();
		t2.start();
		System.out.println(t2.isAlive());
		
		Thread t3 = new Thread();
		t3.start();
		System.out.println(t3.isAlive());
		
		System.out.println(Thread.activeCount());

	}

}
