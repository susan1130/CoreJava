package com.dl.five.sets;
import java.util.TreeSet;
//duplicate values are ignored. null not allowed ...... naturally sorted
public class Eg3 {

	public static void main(String[] args) {
		
		TreeSet<String> h = new TreeSet<String>();
		h.add("Y");
		h.add("O");
		h.add("B");
		h.add("E");
		h.add("A");
		h.add("I");
		//h.add(null);
		System.out.println(h);

	}

}
