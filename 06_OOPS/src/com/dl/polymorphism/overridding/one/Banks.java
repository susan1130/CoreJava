package com.dl.polymorphism.overridding.one;

class Sbi extends Rbi{
	public int rateOfInterest() {
		return 5;
	}
}

class Axis extends Rbi{
	public int rateOfInterest() {
		return 7;
	}
}

class Icici extends Rbi{
	public int rateOfInterest() {
		return 6;
	}
}

public class Banks {

	public static void main(String[] args) {
		Sbi s = new Sbi();
		System.out.println(s.rateOfInterest());

		Axis a = new Axis();
		System.out.println(a.rateOfInterest());
		
		Icici i = new Icici();
		System.out.println(i.rateOfInterest());
		
//Here though the rateOfInterest() method is defined in the Rbi class, each of the Classes Sbi, Axis, Icici have their own definitions which is the one being used. So over-ridding is occuring here.
		
	///	Number n = new Integer(10);
	// Integer extends Number class, so we can use this here.
		
	}

}
