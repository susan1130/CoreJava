package com.dl.one;

public class Eg11 {

	public static void main(String[] args) {
		
		int i = 10;
		int j = 11;
		System.out.println("true && true");
		boolean a = ((i++ == 10) && (j++ == 11));
		System.out.println(a);
		System.out.println(i);
		System.out.println(j);
		
		 i = 10;
		 j = 11;
		//
		System.out.println("true && false");
		boolean b = ((i++ == 10) && (j++ != 11));
		System.out.println(b);
		System.out.println(i);
		System.out.println(j);
		
		 i = 10;
		 j = 11;
		System.out.println("false && true");
		boolean c = ((i++ != 10) && (j++ == 11));
		System.out.println(c);
		System.out.println(i);
		System.out.println(j);
		
		 i = 10;
		 j = 11;
		System.out.println("false && false");
		boolean d = ((i++ != 10) && (j++ != 11));
		System.out.println(d);
		System.out.println(i);
		System.out.println(j);

	}

}
