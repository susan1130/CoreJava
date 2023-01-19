package com.dl.one;

public class Eg5 {
//StringIndexOutOfBoundsException
	public static void main(String[] args) {

		try {
			String s = "Hello World";
			System.out.println(s.charAt(7));
			System.out.println(s.charAt(20));
			
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println(e);
		}

	}

}
