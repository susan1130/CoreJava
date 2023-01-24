package com.dl.one;

import java.util.ArrayList;
import java.util.Optional;
import java.util.stream.Stream;

public class Eg18 {

	public static void main(String[] args) {
		
		ArrayList<Integer> l1 = new ArrayList<>();
		l1.add(33);
		l1.add(55);
		l1.add(11);
		l1.add(22);
		l1.add(44);
		System.out.println("Original List: "+ l1);
		
		Stream<Integer> strm = l1.stream();		//stream: Returns a sequential Stream with this collection as its source.
		
		Optional<Integer> mini = strm.min(Integer :: compare);  	//compare: Compares two int values numerically.
		if(mini.isPresent()) {
			System.out.println("Minimun Value: " +mini.get());
		}
		
		strm = l1.stream();
		
		Optional<Integer> maxi = strm.max(Integer :: compare);
		if(maxi.isPresent()) {
			System.out.println("Maximum Value: " +maxi.get());
		}

	}

}
