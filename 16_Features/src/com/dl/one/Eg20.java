package com.dl.one;

import java.util.ArrayList;
import java.util.Iterator;

public class Eg20 {

	public static void main(String[] args) {
		
		ArrayList<String> l1 = new ArrayList<>();
		l1.add("Cookie");
		l1.add("Bozo");
		l1.add("Buddy");
		l1.add("Pikachu");
		l1.add("Dude");
		//System.out.println("Original List: "+ l1);
		
		System.out.println("Using forEach and :: ");
		l1.forEach(System.out :: println);
		
		
		System.out.println("Using iterator and hasNext(), next() ");
		Iterator<String> ir = l1.iterator();
		while(ir.hasNext()) {
			System.out.println(ir.next());
		}
		
		System.out.println("Using forEach and lambda function  ");
		l1.forEach( s -> System.out.print(s));
	}

}
