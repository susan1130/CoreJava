package com.dl.one;

@FunctionalInterface
interface StudentIn {
	Student id(int id, String name);
}

class Student{
	
	public Student(int id, String name) {
		System.out.println("id: "+id+" Name: "+name);
	} 
}

public class Eg22 {

	public static void main(String[] args) {
		
		StudentIn st = Student :: new;
		st.id(11120, "Cookie");
		st.id(11121, "Dude");
		st.id(11122, "Bozo");
		st.id(11123, "Buddy");
		st.id(11124, "Pikachu");	
	}

}
