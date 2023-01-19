package com.dl.ten.maps;

import java.util.HashMap;
import java.util.WeakHashMap;

public class Eg6 {

	public static void main(String[] args) {
		
		HashMap<String, Integer> hm = new HashMap<>();
		String s1 = "A";
		hm.put(s1, 1);
		System.out.println(hm);
		
		s1 = null;
		System.gc();
		System.out.println(hm);
		
		System.out.println(" ");
		
		WeakHashMap<String, Integer> whm = new WeakHashMap<>();
		String s2 = "A";
		whm.put(s2, 1);
		System.out.println(whm);
		
		s2 = null;
		System.gc();
		System.out.println(whm);

	}

}
