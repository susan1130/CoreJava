package com.dl.six.cursorsEnums;

import java.util.Enumeration;
import java.util.Vector;

public class Eg1 {
//Enum
	public static void main(String[] args) {

		Vector<String> v = new Vector<String>();
		v.add("one");
		v.add("two");
		v.add("three");
		v.add("four");
		v.add("five");
		System.out.println(v);
		
		Enumeration<String> e = v.elements();
		while (e.hasMoreElements()) {
			System.out.println(e.nextElement()); 
			
		}
	}

}
