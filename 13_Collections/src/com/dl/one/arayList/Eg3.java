package com.dl.one.arayList;

import java.util.ArrayList;

public class Eg3 {

	public static void main(String[] args) {

		ArrayList<String> a = new ArrayList<String>();
		a.add("IndexZero");
		a.add(1, "IndexOne");
		a.add(2, "IndexTwo");
		a.add(3, "IndexThree");
		a.add(4, "IndexFour");
		System.out.println("Array a: "+a);
		
		ArrayList<String> b = new ArrayList<String>();
		b.add("Zero");
		b.add(1, "One");
		b.add(2, "Two");
		b.add(3, "Three");
		b.add(4, "Four");
		System.out.println("Array b: "+b);
		
		System.out.println("addAll appends the elements of one array to the specified index of the other array");
		b.addAll(4, a);
		System.out.println(b);
	}

}
