package com.dl.one;

import java.util.Optional;
import java.util.stream.Stream;

//A container object which may or may not contain a non-null value.If a value is present, isPresent() returns true. If no value is present, the object is considered empty and isPresent() returns false. 

//Additional methods that depend on the presence or absence of a contained value are provided, such as orElse()(returns a default value if no value is present) and ifPresent() (performs an action if a value is present). 

//This is a value-based class; programmers should treat instances that are equal as interchangeable and should not use instances for synchronization, or unpredictable behavior may occur. For example, in a future release, synchronization 


public class Eg16 {

	public static void main(String[] args) {
		
		Stream<String> name = Stream.of("Moss","Roy","Jen","Douglas","Bloke");
		Optional<String> ff = name.filter( i -> i.startsWith("M")).findFirst();
		
		if (ff.isPresent()) {
			
			System.out.println(ff.get());
		} else {
			System.out.println("No matches found");
		}
	}

}
