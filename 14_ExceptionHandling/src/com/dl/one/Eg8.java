package com.dl.one;

public class Eg8 {

	public static void main(String[] args) {

		try {
			int a = 10;
			int b = 20;
			int c = 30;
			System.out.println(a+b);
			System.out.println(a/c);
			
			int ia[] = {10,20,30,40,50};
			System.out.println(ia[3]);
			System.out.println(ia[40]);
			
			String s = "10";
			int i = Integer.parseInt(s);
			
			String s1 = "null";
			
			String s11 = "Hello java hello python";
			System.out.println(s11.charAt(12));
			System.out.println(s11.charAt(14));
			
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
