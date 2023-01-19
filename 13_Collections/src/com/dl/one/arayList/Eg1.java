package com.dl.one.arayList;

import java.util.ArrayList;

//Array // Index Calls // Loops // ArrayMethods
// Collection is a class // no of methods
//Collection is a interface // lists & sets // Methods, Loops, Cursor
//Map is not a child interface of Collection
//Collection -- Lists --> ArraList --> LinkedList --> Vector --> Stack

public class Eg1 {

	public static void main(String[] args) {
		
		// ArrayList
		//Maintains insertion order... Allows duplicates and null(more than one)
		ArrayList<String> a = new ArrayList<String>();
		a.add("IndexOne");
		a.add("IndexTwo");
		a.add("IndexThree");
		a.add("IndexFour");
		System.out.println(a);
		
		System.out.println("insertion using index values ........");
		a.add(0, null);
		a.add(4, "Katy Perry");
		System.out.println(a);
		
		System.out.println("Duplicate elements will be added to the array like normal insertion");
		a.add("IndexThree");
		a.add(5, "IndexOne");
		a.add("Katy Perry");		// added to the end of the array, if the index isnt't mentioned
		a.add(null);
		System.out.println(a);
	}

}
