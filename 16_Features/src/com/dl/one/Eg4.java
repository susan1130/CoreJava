package com.dl.one;

@FunctionalInterface
interface Login {
	void userDetails(String uName, String password);
}

public class Eg4 {

	public static void main(String[] args) {
		
		Login l = (uN, pW) -> System.out.println("UserName is: "+ uN+ " .Password is: "+ pW);
		l.userDetails("System Analyst", "SA");

	}

}
