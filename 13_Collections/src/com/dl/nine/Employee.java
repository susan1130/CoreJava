package com.dl.nine;
//Displaying the real power of comparator
public class Employee {
	
	int id;
	String name;
	
	public Employee() {
		
	}

	public Employee(int id, String name) {
		
		this.id = id;
		this.name = name;
	}

	//Without this method you will get only address values in the output
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}
	
	
	
}
