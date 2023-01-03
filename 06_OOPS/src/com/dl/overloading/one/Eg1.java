package com.dl.polymorphism.overloading.one;

public class Eg1 {

	public static void main(String[] args) {
		//Method overloading >>>> Method must be the same// Args must be different//Overloading one class is sufficient
		//Types of overloading >>>> method overloading// operator overloading // constructor overloading
		
	
		//METHOD OVERLOADING
		
		Eg1 e = new Eg1();
		e.fuelCost(20, 20);
		e.fuelCost(44f, 55f);
		e.fuelCost(89d, 99d);
	}
	public void fuelCost(float petPrice, float diePrice) {
		System.out.println("Petrol price: "+petPrice);
		System.out.println("Diesel price: "+diePrice);
	}
	public void fuelCost(double petPrice, double diePrice) {
		System.out.println("Petrol price: "+petPrice);
		System.out.println("Diesel price: "+diePrice);
	}
	public void fuelCost(int petPrice, int diePrice) {
		System.out.println("Petrol price: "+petPrice);
		System.out.println("Diesel price: "+diePrice);
	}
}
