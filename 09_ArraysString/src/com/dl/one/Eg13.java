package com.dl.one;

public class Eg13 {

	public static void main(String[] args) {
		
		//Immutable 
		String s1 = "HEllo Java"; 					//literal
		String s2 = new String ("Hello Java");		//new keyword
		System.out.println(s1);
		System.out.println(s2);
		
		//Mutable   StringBuffer
		StringBuffer sb = new StringBuffer("helloJava");
		sb.append("_helloJavascript");
		System.out.println(sb);
		
		//Mutable   StringBuilder
		StringBuilder sb1 = new StringBuilder("HelloJava");
		sb1.append("HelloJavascript");
		System.out.println(sb1);

	}

}
