package com.dl.variables.one;

public class Parent {

	private static int userId = 538;				//private modifier used
	protected static String userName = "Ramesh";	//protected modifier
	public static long userContactNo = 2134567891L;	//public modifier
	static double salary = 30000;					//default modifier
	
	public static void main(String[] args) {
		System.out.println(userId);
		System.out.println(userName);
		System.out.println(userContactNo);
		System.out.println(salary);

	}

}
