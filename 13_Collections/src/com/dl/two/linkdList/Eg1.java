package com.dl.two.linkdList;

import java.util.LinkedList;

public class Eg1 {

	public static void main(String[] args) {
// Duplicate values are allowed and appended to the specified index
// nulls are also allowed
		LinkedList<String> l = new LinkedList<>();
		l.add("Zero");
		l.add(1, "One");
		l.add(2, "Two");
		l.add(3, "Three");
		l.add(4, "Four");
		l.add(5, "Five");
		l.add(3, "DuplicateThree");
		l.add(null);
		System.out.println("linked list: "+l);
		
		System.out.println("	....	");
		
		System.out.println("Get first method: "+ l.getFirst());
		System.out.println("getLast(): "+ l.getLast());
		System.out.println("Index of: DuplicateThree-> "+ l.indexOf("DuplicateThree"));
		System.out.println("Last index of the list: "+l.lastIndexOf(null));
		System.out.println("get value of index 3: " +l.get(4));
		
		System.out.println("	....	");
		
		System.out.println("setting value in the place of null: "+ l.set(7, "Cookie"));
		System.out.println("Updated list: "+l);
		
		System.out.println("	....	");
		
		System.out.println("Removing the DuplicateThree element: "+ l.remove(3));
		System.out.println("Updated list: "+l);
		

	}

}
