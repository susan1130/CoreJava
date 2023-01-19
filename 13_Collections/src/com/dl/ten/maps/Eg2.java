package com.dl.ten.maps;


import java.util.Collection;
import java.util.LinkedHashMap;


public class Eg2 {

	public static void main(String[] args) {
		
		LinkedHashMap<Integer, String> lhm = new LinkedHashMap<>();
		lhm.put(5, "IndexFive");
		lhm.put(7, "IndexSeven");
		lhm.put(3, "IndexThree");
		lhm.put(1, "IndexOne");
		lhm.put(0, "IndexZero");
		lhm.put(4, "IndexFour");
		lhm.put(2, "IndexTwo");
		System.out.println(lhm);
//Insertion order is preserved
		
		lhm.put(null, null);
		lhm.put(null, null);	//only 1 null key is allowed. insertion order is preserved
		lhm.put(8, null);
		lhm.put(9, null);		//nulls are allowed if key values are unique and specified
		System.out.println(lhm);
		
		Collection<String> val = lhm.values();
		Collection<Integer> keys = lhm.keySet();
		System.out.println("Keys are: "+keys);
		System.out.println("Values are: "+val);
		
		lhm.clear();				//Deleting the linkedHashMap
		System.out.println(lhm);
		
	}

}
