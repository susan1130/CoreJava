package com.dl.one;

//The Runnable interface should be implemented by any class whose instances are intended to be executed by a thread. The class must define a method of no arguments called run. 

//This interface is designed to provide a common protocol for objects that wish to execute code while they are active. For example, Runnable is implemented by class Thread.Being active simply means that a thread has been started and has not yet been stopped. 

//In addition, Runnable provides the means for a class to be active while not sub classing Thread. A class that implements Runnable can run without sub classing Thread by instantiating a Thread instance and passing itself in as the target. 

//Runnable is similar to @FunctionalInterface as it has only one abstract method 

class A implements Runnable{

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("Child Thread");
		}
		
	}
	
}

public class Eg8 {

	public static void main(String[] args) {
		
		A a = new A();
		Thread t = new Thread(a);
		t.start();
		for (int i = 0; i < 5; i++) {
			System.out.println("Main Thread");
		}

	}

}
