package com.dl.one;

public class Eg11 {

	public static void main(String[] args) {

		// replace(), replaceAll(), replaceFirst() 
		
		String s1 = "I am learning Java and Java Script. I am also learning Html";
		System.out.println(s1.replace(" am", "'m"));
		System.out.println(s1.replaceAll("J", "j"));
		System.out.println(s1.replaceFirst("learning", "studying"));
		System.out.println(s1.replace("learning", "studying"));
		//System.out.println(s1);

	}

}
