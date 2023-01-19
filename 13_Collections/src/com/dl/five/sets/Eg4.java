package com.dl.five.sets;

import java.util.SortedSet;
import java.util.TreeSet;
//SortedSet 
public class Eg4 {

	public static void main(String[] args) {
		
		SortedSet<String> s = new TreeSet<String>();
		s.add("C");
		s.add("D");
		s.add("A");
		s.add("a");
		s.add("B");
		s.add("E");
		s.add("F");
		s.add("B");
		s.add("C");
		System.out.println(s);  
//duplicates are ignored and sorted set
		System.out.println(s.first());		//First element of the set
		System.out.println(s.last());		//Last element of the set
		
		System.out.println(s.headSet("D"));		//elements to the left of D
		System.out.println(s.tailSet("D"));		//elements to the right of D
		System.out.println(s.subSet("B", "F"));	//elements between B and F
	}

}
