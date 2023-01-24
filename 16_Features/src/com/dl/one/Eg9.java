package com.dl.one;

public class Eg9 {

	public static void main(String[] args) {

		Runnable r = () -> {
			for (int i = 0; i < 5; i++) {
				System.out.println("Main Thread");
			}
		};
		Thread t = new Thread(r);
		t.start();
	}

}
