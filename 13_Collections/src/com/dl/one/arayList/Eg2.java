package com.dl.one.arayList;

import java.util.ArrayList;

// ArrayList methods

public class Eg2 {

	public static void main(String[] args) {
		
		ArrayList<String> a = new ArrayList<String>();
		a.add("IndexOne");
		a.add("IndexTwo");
		a.add("IndexThree");
		a.add("IndexFour");
		a.add("Maroon 5");
		a.add("Katy Perry");
		System.out.println("Original array: "+a);
		
		System.out.println("	....	");
		
		System.out.println("get method fetches the element in the specified index ...........");
		System.out.println("Index 4: "+a.get(4));
		System.out.println("Index 5: "+a.get(5));
		
		System.out.println("	....	");
		
		System.out.println("set method replaces the element isn the specified index with a different value ....");
		a.set(2, null);
		a.set(0, "Nickelback");
		System.out.println("Changed array: "+a);
		
		System.out.println("	....	");
		
		System.out.println("remove deletes the elemnt in the specified index .....");
		System.out.println("Removing the following element  "+ a.remove(4));
		System.out.println("Changed array: "+ a);
	}

}
