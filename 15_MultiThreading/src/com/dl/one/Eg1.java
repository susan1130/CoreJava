package com.dl.one;

public class Eg1 {

	public static void main(String[] args) {

		Thread t = Thread.currentThread();
		System.out.println(t);					//Thread[main,5,main]
		System.out.println(t.getName());		//main
		System.out.println(t.getClass());		//class java.lang.Thread
		System.out.println(t.getState());		//RUNNABLE
		

	}

}
