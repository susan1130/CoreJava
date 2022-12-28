package com.dl.one;

public class Eg12 {

	public static void main(String[] args) {
		
		String s1 = "Hello in Java and Hello in Python";
		char ch [] = s1.toCharArray();
		ch[11] = 'l';
		System.out.println(ch);
		
		String s2 = "JavaProgramming";
		System.out.println(s2.substring(5,10));
		
		StringBuffer sb = new StringBuffer("Re-act");
		StringBuffer dc = sb.deleteCharAt(2);
		System.out.println(dc);
	}

}
