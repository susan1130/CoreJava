package com.dl.one;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Eg17 {

	public static void main(String[] args) {
		
		ArrayList<String> l1 = new ArrayList<>();
		l1.add("Roy");
		l1.add("Maurice");
		l1.add("Jen");
		l1.add("Douglas");
		l1.add("Moss");
		System.out.println(l1);
		
		List<String> l2 = l1.stream().map(s -> s.toUpperCase()).collect(Collectors.toList());
		System.out.println(l2);
		
//map: Returns a stream consisting of the results of applying the given function to the elements of this stream.
		
//collect: Performs a mutable reduction operation on the elements of this stream using a Collector. A Collector encapsulates the functions used as arguments to collect(Supplier, BiConsumer, BiConsumer), allowing for reuse of collection strategies and composition of collect operations such as multiple-level grouping or partitioning. 
		
//Collectors: Implementations of Collector that implement various useful reduction operations, such as accumulating elements into collections, summarizing elements according to various criteria, etc. 

//toList:  Returns a Collector that accumulates the input elements into anew List. There are no guarantees on the type, mutability,serializability, or thread-safety of the List returned; if more control over the returned List is required, use toCollection(Supplier).
	}

}
