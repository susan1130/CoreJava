package com.dl.seven.comparable;

import java.util.ArrayList;
import java.util.Collections;

public class Employee implements Comparable<Employee>{
//Comparable provides a single sorting sequence. In other words, we can sort the collection on the basis of a single element such as id, name, and price.

	int id;
	String name;
	
	public Employee(int id, String name) {
		
		this.id = id;
		this.name = name;
	}

	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}


	//For printing the objects in ascending order
//	@Override
//	public int compareTo(Employee o) {
//		
//		return name.compareTo(o.name);
//	}
	
	//for printing the objects in descending order
	@Override
	public int compareTo(Employee o) {
		
		return o.name.compareTo(name);
	}

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
		
		Collections.sort(e);
		System.out.println(e);
		
		Collections.reverse(e);
		System.out.println(e);
	}

}
