package com.dl.five.sets;

import java.util.HashSet;
//duplicate values are ignored. null allowed only once...... naturally sorted
public class Eg1 {

	public static void main(String[] args) {
		
//		HashSet<String> h = new HashSet<String>();
//		h.add("Y");
//		h.add("O");
//		h.add("B");
//		h.add("E");
//		h.add("A");
//		h.add("I");
//		h.add(null);
//		System.out.println(h);
		//how come this doesn't work? and suddenly works sometimes

		HashSet<String> h = new HashSet<String>();
		h.add("D");
		h.add("F");
		h.add("E");
		h.add("C");
		h.add("B");
		h.add("A");
		h.add(null);
		System.out.println(h);
	}

}
