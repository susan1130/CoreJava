package com.dl.one;

class AAA implements Runnable{
	
	@Override
	public void run() {
		System.out.println("Run method of class AAA");
		
		synchronized (this) {
			System.out.println("Synchronised Block of class AAA");
			for (int i = 0; i < 4; i++) {
				System.out.println("For loop in synchronised block and run method "+i);
			}
		}
		
	}
}

public class Eg12 {

	public static void main(String[] args) {
		
		AAA a = new AAA();
		System.out.println("Object AAA reference "+a);
		
		Thread t = new Thread(a);
		t.start();
		
		System.out.println("Start Method: ");
		//a.wait();
		synchronized (a){
			System.out.println("Synchronised block of class Eg12: ");
			for (int i = 0; i < 4; i++) {
				System.out.println("For loop in synchronised block: "+i);
			}
		}
		
	}

}
