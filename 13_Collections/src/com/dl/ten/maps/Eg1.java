package com.dl.ten.maps;

import java.util.HashMap;

public class Eg1 {

	public static void main(String[] args) {
		
		HashMap<Integer, String> hm = new HashMap<>();
		hm.put(5, "IndexFive");
		hm.put(7, "IndexSeven");
		hm.put(3, "IndexThree");
		hm.put(1, "IndexOne");
		hm.put(0, "IndexZero");
		hm.put(4, "IndexFour");
		hm.put(2, "IndexTwo");
		System.out.println(hm);		//{0=IndexZero, 1=IndexOne, 2=IndexTwo, 3=IndexThree, 4=IndexFour, 5=IndexFive, 7=IndexSeven}
		
		//It gets sorted according to the key. Insertion order isn't preserved
		
		hm.put(null, null);
		hm.put(null, null);
		System.out.println(hm);     //one null key value is allowed rest all are ignored
		
		System.out.println(hm.size());     //size 8
		
		hm.put(0, "DuplicateZero");    //updates the value at key 0
		System.out.println(hm);
	}

}
