package com.dl.six.cursorsEnums;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

//Iterator lists and sets
public class Eg2 {

	public static void main(String[] args) {
		
		ArrayList<String> a = new ArrayList<String>();
		a.add("A");
		a.add("B");
		a.add("C");
		a.add("D");
		a.add("E");
		a.add("F");
		System.out.println(a);
		
		Iterator<String> i = a.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}

		System.out.println(" ");
		
		
		HashSet<String> h = new HashSet<String>();
		h.add("a");
		h.add("b");
		h.add("c");
		h.add("d");
		h.add("e");
		h.add("f");
		h.add("g");
		System.out.println(h);
		
		Iterator<String> ii = h.iterator();
		while(ii.hasNext()) {
			System.out.println(ii.next());
		}
	}

}
