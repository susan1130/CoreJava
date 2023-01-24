package com.dl.one;

import java.util.ArrayList;
import java.util.stream.Stream;

public class Eg19 {

	public static void main(String[] args) {
		
		ArrayList<Integer> l1 = new ArrayList<>();
		l1.add(33);
		l1.add(55);
		l1.add(11);
		l1.add(22);
		l1.add(44);
		System.out.println("Original List: "+ l1);
		
		Stream<Integer> srtd = l1.stream().sorted();	//using sorted method of stream
		System.out.println("Natural Sorting");
		srtd.forEach( (n) -> System.out.println(n));

	}

}
