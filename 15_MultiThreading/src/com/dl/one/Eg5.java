package com.dl.one;

public class Eg5 extends Thread{

	public static void main(String[] args) {

		Eg5 e1 = new Eg5();
		Eg5 e2 = new Eg5();
		Eg5 e3 = new Eg5();
		
		System.out.println(e1.getPriority());
		System.out.println(e2.getPriority());
		System.out.println(e3.getPriority());
		
		e1.setPriority(1);
		e2.setPriority(3);
		e3.setPriority(9);
		
		
		System.out.println(e1.getPriority());
		System.out.println(e2.getPriority());
		System.out.println(e3.getPriority());
		
		
		
		e1.setPriority(MAX_PRIORITY);
		e2.setPriority(MIN_PRIORITY);
		e3.setPriority(NORM_PRIORITY);
		
		System.out.println(e1.getPriority());
		System.out.println(e2.getPriority());
		System.out.println(e3.getPriority());

	}

}
