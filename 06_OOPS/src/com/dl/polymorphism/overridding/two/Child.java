package com.dl.polymorphism.overridding.two;

class GrandParent{
	public void m1() {
		System.out.println("Inside m1 method of GrandParent Class");
	}
}

class Parent extends GrandParent{
	public void m1() {
		System.out.println("Inside m2 method of Parent Class");
	}
}

public class Child extends Parent{

	public static void main(String[] args) {
		
		Child c = new Child();
		c.m1();// the obj c can only access the m1() method of the Parent class that is extended to it
		
		Parent p = new Child();
		p.m1();// the p obj access the m1() method of the Parent class that is extended to it
		
		GrandParent g = new Parent();
		g.m1();// the g obj access the m1() method of the Parent class
		
		GrandParent gp = new GrandParent();
		gp.m1();// the gp can access the m1() method of the GrandParent class 

	}

}
