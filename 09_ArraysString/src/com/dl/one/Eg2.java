package com.dl.one;

public class Eg2 {

	public static void main(String[] args) {
		
		// String Literals....stored in the string constant pool(SCP) area
		String s1 = "JavaFullstack"; 
		String s2 = "JavaFullstack";
		// since both s1 and s2 have the same value only one instance of JavaFullstack is created in the SCP
		// and both s1 and s2 point to it.
		
		String s3 = "Python"; //s3 points to Python which has its own instance in the SCP and isn't shared by anyone
		
		System.out.println(s1.equals(s2));	
		System.out.println(s1 == s2);
		System.out.println(s1 == s3);
		
		System.out.println("---------------- Heap Area --------------------");
		//using the heap area
		String ss1 = new String("Friday");
		String ss2 = new String("Friday");
		String ss3 = new String("Yay! Friday");
		
		System.out.println(ss1.equals(ss2));	
		System.out.println(ss1 == ss2);		// here though the contents are the same, it is false
		//because of the existence of the separate objects ss1 and ss2 
		System.out.println(ss1 == ss3);

	}

}
