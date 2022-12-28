package com.dl.inheritance.five;

class GrandParent extends Object{
	public void m1() {
		System.out.println("Method m1 from the GrandParent Class");
	}
}

class Parent extends GrandParent{
	public void m2(){
		System.out.println("Method m2 from the Parent Class");
	}
}

class Child extends GrandParent{
	public void m3() {
		System.out.println("Method m3 from the Child class");
	}
}

//Hierarchical
public class Client {
	public static void main(String[] args) {
		Child c = new Child();
		c.m1();
		c.m3();
		// since a Child class obj is created so only the Child class method and the GrandParent class (that the Child class extends) are accessible to the obj. Parent class is not mentioned anywhere so it can't be accessed.
		
		Parent p = new Parent();
		p.m2();
		p.m1();
		//a separate Parent class obj is needed to access the methods found there. As Parent extends into GrandParent so we can access it's method there
	}
}
