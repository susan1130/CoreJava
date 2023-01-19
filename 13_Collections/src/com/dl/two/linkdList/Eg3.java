package com.dl.two.linkdList;
import java.util.Collections;
import java.util.LinkedList;

public class Eg3 {

	public static void main(String[] args) {
		
		LinkedList<Integer> li = new LinkedList<Integer>();
		li.add(99);
		li.add(23);
		li.add(45);
		li.add(19);
		li.add(82);
		li.add(1);
		System.out.println("original Linkedlist: "+ li);
		li.sort(null);
		System.out.println("Sorted List: "+ li);
		
		Collections.reverse(li);
		System.out.println("In reverse order: "+li);

	}

}
