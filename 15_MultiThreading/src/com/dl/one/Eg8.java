package com.dl.one;

public class Eg8 extends Thread{

	@Override
	public void run() {
		int flag = 0;
		flag = flag+1;
		for (int i = 0; i < 5; i++) {
			
			try {
				Thread.sleep(1500);
				System.out.println(i);
				
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
		
	}
	public static void main(String[] args) throws InterruptedException {

		Eg8 e1 = new Eg8();
		Eg8 e2 = new Eg8();
		Eg8 e3 = new Eg8();
		
		e1.start();
		e1.join();				//Waits for this thread to die. 
		e2.start();
		e2.join();	
		e3.start();
		e3.join();	
	}

}
