package com.dl.one;

import java.util.Iterator;

class ThreadOne extends Thread{
	
	public void m1() {

		for (int i = 0; i < 3; i++) {
			System.out.println("Non-Synchronised area: "+i);
		}
		
		synchronized (this) {
			for (int i = 0; i < 3; i++) {
				System.out.println("Synchronised area: "+i);
			}
		}
		System.out.println("Non-Synchronised area");
	}
}

public class Eg11 extends Thread{

	ThreadOne one;

	public Eg11(ThreadOne one) {
		this.one = one;
	}

	@Override
	public void run() {
		one.m1();
	}

	public static void main(String[] args) {
		
		ThreadOne t1 = new ThreadOne();
		Eg11 test1 = new Eg11(t1);
		test1.start();

	}

}
