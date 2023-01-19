package com.dl.six.cursorsEnums;

import java.util.ArrayList;
import java.util.ListIterator;

public class Eg3 {
//list iterator can go both directions. lists can use this
	public static void main(String[] args) {
		
		ArrayList<String> a = new ArrayList<String>();
		a.add("One");
		a.add("Two");
		a.add("Three");
		a.add("Four");
		a.add("Five");
		System.out.println(a);
		
		ListIterator<String> li = a.listIterator();
		while(li.hasNext()) {
			System.out.println(li.next());
		}
		System.out.println(" ");
		while(li.hasPrevious()) {
			System.out.println(li.previous());
		}

	}

}
