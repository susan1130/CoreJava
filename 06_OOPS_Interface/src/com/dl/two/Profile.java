package com.dl.two;

public interface Profile {

	int id = 20072022;
	public static final String username = "Happilio";
	long phnNo = 12345678962L;
	String email = "abc@gmail.com";
	String address = "Financial District, Hyderabad";
	
	public static void main(String[] args) {
		
		System.out.println(id);
		System.out.println(phnNo);
		System.out.println(username);
		System.out.println(email);
		System.out.println(address);
	}
}
