package com.dl.one.arayList;

import java.util.ArrayList;
import java.util.Collections;

public class Eg5 {

	public static void main(String[] args) {

		ArrayList<Integer> ai = new ArrayList<Integer>();
		ai.add(99);
		ai.add(23);
		ai.add(45);
		ai.add(33);
		ai.add(20);
		ai.add(1);
		System.out.println("original arraylist: "+ ai);
		ai.sort(null);
		System.out.println("Sorted List: "+ ai);
		
		Collections.reverse(ai);
		System.out.println("In reverse order: "+ai);
		

	}

}
