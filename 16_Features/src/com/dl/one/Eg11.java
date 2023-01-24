package com.dl.one;

public class Eg11 {
// Thread using thread class and lambda function
	public static void main(String[] args) {
		
		Thread t = new Thread(()-> {
			for (int i = 0; i < 4; i++) {
				System.out.println("Main thread");
			}
		});
		t.start();
	}

}
