package com.dl.one;

public class Eg10 {
//Thread using runnable interface and lambda function
	public static void main(String[] args) {
		
		Thread t = new Thread (new Runnable() {
			
			@Override
			public void run() {
				for (int i = 0; i < 5; i++) {
					System.out.println("Main Method Thread");
				}
				
			}
		});
		t.start();
	}

}
