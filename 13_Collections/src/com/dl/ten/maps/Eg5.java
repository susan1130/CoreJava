package com.dl.ten.maps;

import java.util.HashMap;
import java.util.IdentityHashMap;

public class Eg5 {

	public static void main(String[] args) {

		String s1 = new String("a");
		String s2 = new String("a");
		
		HashMap<String, String> h = new HashMap<>();
		h.put(s1, "A");
		h.put(s2, "B");
		System.out.println(h);
		System.out.println(s1.equals(s2)); 	//here both the keys are equal 
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
//since both the keys are equal here, hashCode for both is same i.e. 97
		
		IdentityHashMap<String, String> ihm = new IdentityHashMap<>();
		ihm.put(s1, "A");
		ihm.put(s2, "B");
		System.out.println(ihm);
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));
		
//here IdentityHashMap identifies both entries as being seperate		
		
	}

}
