package com.dl.one;

/*An informative annotation type used to indicate that an interface type declaration is intended to be a functional interface as defined by the Java Language Specification.
 * Conceptually, a functional interface has exactly one abstract method.
 * Since default methods have an implementation, they are not abstract. 
 * If an interface declares an abstract method overriding one of the public methods of java.lang.Object, that also does not count toward the interface's abstract method count since any implementation of the interface will have an implementation from java.lang.Object or elsewhere. 

Note that instances of functional interfaces can be created with lambda expressions, method references, or constructor references. 
*/

@FunctionalInterface
interface Variables{
	void sum();
}

public class Eg2 implements Variables {

	static int x = 11;
	int y = 22;
	
	public static void main(String[] args) {
		
		new Eg2().sum();

	}

	@Override
	public void sum() {
		
		int a = 55, b = 77;
		System.out.println("Local variable in main method: "+a);
		System.out.println("Local variable in main method: "+b);
		System.out.println("Static variable in main method: "+x);
		System.out.println("Local variable: "+ new Eg2().y);
		
	}

}
