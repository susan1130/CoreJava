package com.dl.ten.maps;

import java.util.TreeMap;

public class Eg3 {

	public static void main(String[] args) {

		TreeMap<Integer, String> tm = new TreeMap<>();
		tm.put(5, "IndexFive");
		tm.put(7, "IndexSeven");
		tm.put(3, "IndexThree");
		tm.put(1, "IndexOne");
		tm.put(0, "IndexZero");
		tm.put(4, "IndexFour");
		tm.put(2, "IndexTwo");
		System.out.println(tm);
// gets sorted automatically. Insertion order isn't preserved
		
		tm.put(6, null);					//null values are ok with unique key values
		//tm.put(null, "NullValue");		//null key isnt allowed
		System.out.println(tm);
		System.out.println(tm.size());

	}

}
