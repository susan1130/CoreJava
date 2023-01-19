package com.dl.one;

public class Eg2 {
//ArrayIndexOutOfBoundsException 
	public static void main(String[] args) {
		
		System.out.println("Before");
		try {
			int i [] = {10,20,30,40,50};
			System.out.println(i[2]);
			System.out.println(i[10]);
			
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		System.out.println("After");
	}

}
