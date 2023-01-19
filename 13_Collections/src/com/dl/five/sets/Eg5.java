package com.dl.five.sets;

import java.util.NavigableSet;
import java.util.TreeSet;

//NavigableSet
public class Eg5 {

	public static void main(String[] args) {
		
		NavigableSet<Integer> n = new TreeSet<Integer>();
		n.add(65);
		n.add(67);
		n.add(66);
		n.add(68);
		n.add(69);
		n.add(85);
		n.add(68);
		n.add(70);
		System.out.println(n);
//duplicates are ignored and sorted set
		System.out.println(n.descendingSet());
		
		System.out.println("Greater than or equal to 68: "+n.ceiling(68));
		System.out.println("Greater than or equal to 90: "+n.ceiling(90));
		System.out.println("Greater than or equal to 64: "+n.ceiling(64));
		
		System.out.println("Greater than 66: "+n.higher(66));
		System.out.println("Greater than 90: "+n.higher(90));
		
		System.out.println("Less than or equal to 85: "+n.floor(85));
		System.out.println("Less than or equal to 70: "+n.floor(70));
		System.out.println("Less than or equal to 90: "+n.floor(90));
		
		System.out.println(n);
		
		System.out.println("Less than 70: "+n.lower(70));
		System.out.println("Less than 60: "+n.lower(60));
		
		System.out.println("First element in set: "+n.pollFirst());
		System.out.println("Last element in set: "+n.pollLast());
	}

}
