package com.dl.one;

public class Eg4 {

	public static void main(String[] args) {
		
		System.out.println("Before");
		
		try {
			String s = null; 
			System.out.println(s.length());
			
		} catch (NullPointerException e) {
			System.out.println(e);
		}
		
		System.out.println("After");

	}

}
