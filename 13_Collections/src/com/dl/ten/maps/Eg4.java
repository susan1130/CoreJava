package com.dl.ten.maps;

import java.util.HashMap;

public class Eg4 {

	public static void main(String[] args) {
		
		HashMap<Integer, String> hm1 = new HashMap<>();
		hm1.put(1, "IndexOne");
		hm1.put(2, "IndexTwo");
		
		HashMap<Integer, String> hm2 = new HashMap<>(hm1);
		hm2.put(5, "One");
		hm2.put(6, "Two");
		
		System.out.println(hm2);

	}

}
