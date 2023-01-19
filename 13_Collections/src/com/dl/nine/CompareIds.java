package com.dl.nine;

import java.util.Comparator;

public class CompareIds implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		
		Integer i = o1.id;
		return i.compareTo(o2.id);
	}

	

}
