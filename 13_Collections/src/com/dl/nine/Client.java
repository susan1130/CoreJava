package com.dl.nine;

import java.util.ArrayList;
import java.util.Collections;



public class Client {

	public static void main(String[] args) {
		
		Employee emp1 = new Employee(4, "A");
		Employee emp2 = new Employee(3, "C");
		Employee emp3 = new Employee(1, "B");
		Employee emp4 = new Employee(2, "D");
		
		ArrayList<Employee> e = new ArrayList<Employee>();
		e.add(emp1);
		e.add(emp2);
		e.add(emp3);
		e.add(emp4);
		System.out.println(e);
		
		Collections.sort(e, new CompareIds());
		System.out.println(e);
		
		Collections.sort(e, new CompareNames());
		System.out.println(e);
		
	}

}
