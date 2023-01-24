package com.dl.one;

public class Eg7 {

//Causes the currently executing thread to sleep (temporarily cease execution) for the specified number of milliseconds, subject to the precision and accuracy of system timers and schedulers. The thread does not lose ownership of any monitors.

	public static void main(String[] args) throws InterruptedException {

		for (int i = 0; i < 5; i++) {

			Thread.sleep(1500);		
			System.out.println(i);
		}

	}

}
