package com.dl.five.sets;

import java.util.LinkedHashSet;
//duplicate values are ignored. null allowed only once not sorted naturally
public class Eg2 {

	public static void main(String[] args) {
		
		LinkedHashSet<String> h = new LinkedHashSet<String>();
		h.add("Y");
		h.add("O");
		h.add("B");
		h.add("E");
		h.add("A");
		h.add("I");
		h.add(null);
		System.out.println(h);

	}

}
