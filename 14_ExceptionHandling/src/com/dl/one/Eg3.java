package com.dl.one;

public class Eg3 {
// NumberFormatException
	public static void main(String[] args) {

		System.out.println("Before");
		try {
			String s = "Ten";
			int i = Integer.parseInt(s);
			System.out.println(i);
			
		} catch (NumberFormatException e) {
			System.out.println(e);
		}
		System.out.println("After");

	}

}
