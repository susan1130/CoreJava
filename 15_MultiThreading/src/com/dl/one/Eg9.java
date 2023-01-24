package com.dl.one;

class A extends Thread{
	@Override
	public void run() {
		for (int i = 0; i < 4; i++) {
			System.out.println("Thread A: "+i);
		}
	}
}

class B extends Thread{
	@Override
	public void run() {
		for (int i = 0; i < 4; i++) {
			System.out.println("Thread B: "+i);
		}
	}
}

public class Eg9 {
//Even though we have assigned priorities, they don't make much of a difference since it's a native language
//written code
	public static void main(String[] args) {
		
		Thread a = new A();
		Thread b = new B();
		
		a.setPriority(Thread.MIN_PRIORITY);
		b.setPriority(Thread.MAX_PRIORITY);
		
		a.start();
		b.start();
	}

}
