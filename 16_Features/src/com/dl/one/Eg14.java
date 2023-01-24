package com.dl.one;

//Predicate:  Represents a predicate (boolean-valued function) of one argument. 

//This is a functional interface whose functional method is test(Object).

//  Predicate and lambda function

import java.util.function.Predicate;

public class Eg14 {

	public static void main(String[] args) {
		
//		Predicate<Integer> p = x -> (x>50);
//		System.out.println(p.test(20));			//true
//		System.out.println(p.test(100));		//false
		
//		Predicate<Integer> p1 = a -> a>100;
//		Predicate<Integer> p2 = a -> a<300;
//		Predicate<Integer> p3 = p1.and(p2);
//		boolean test = p3.test(200);
//		System.out.println(test);		//true for 200 since 200>100 and 200<300
//		test = p3.test(500);
//		System.out.println(test);		//false for 500 since 500>100 but 500>300
		
//		Predicate<Integer> p = a -> a>100;
//		Predicate<Integer> pp = p.negate();
//		boolean b1 = pp.test(90);			//! 90>100
//		System.out.println(b1);				// true
//		b1 = pp.test(500);					//! 500>100
//		System.out.println(b1);				//false
//		
//		String s1 = "Hello";
//		String s2 = "Hi";
//		Predicate<Object> p = Predicate.isEqual(s2);	// Returns a predicate that tests if two arguments 													are equal according to the object specified ...s2 here
//		System.out.println(p.test(s1));					// false
//		System.out.println(p.test(s2));					// true
		
		Predicate<String> pr = s -> s.length() > 5;
		System.out.println(pr.test("Hi"));				// Hi is < 5 hence false
		System.out.println(pr.test("Bello Signorita"));	// > 5 hence true
		
	}

}
