package com.dl.one;

//classNotFoundException

class JDBC{
	static {
		System.out.println("Connected");
	}
}
public class Eg6 {
	
	public static void main(String[] args) {
		
		try {
			Class.forName("com.dl.one.JDBCs");
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
