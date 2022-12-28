package com.dl.one;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Eg2 {
// using BufferReader and InputStreamReader as the means of input 
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a Salary: ");
		String rdl = br.readLine();
		System.out.println(rdl);
		
		System.out.println("Enter id number: ");
		int i = br.read();
		System.out.println(i);
		System.out.println((char)i);

	}

}
