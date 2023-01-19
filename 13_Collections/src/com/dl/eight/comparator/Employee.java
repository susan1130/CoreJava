package com.dl.eight.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

//The Comparator provides multiple sorting sequences. In other words, we can sort the collection on the basis of multiple elements such as id, name, and price etc.
public class Employee implements Comparator<Employee>{
	
	int id;
	String name;
	
	
	
	public Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}
	

	public Employee() {
		// TODO Auto-generated constructor stub
	}


	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}


//Printing in ascending order of name 
//	@Override
//	public int compare(Employee o1, Employee o2) {
//		// TODO Auto-generated method stub
//		return o1.name.compareTo(o2.name);
//	}
	
//Printing in descending order of name
	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return o2.name.compareTo(o1.name);
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
		
		Collections.sort(e, new Employee());
		System.out.println(e);
		
		Collections.reverse(e);
		System.out.println(e);

	}

	

}
