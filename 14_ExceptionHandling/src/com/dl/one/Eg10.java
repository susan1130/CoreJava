package com.dl.one;

import java.io.File;
import java.io.IOException;

//Throwable is the parent of all the Exceptions. Throwable has 2 children: Exception and Error

public class Eg10 {

	public static void main(String[] args) throws IOException {
		
		File f = new File("ppl.txt");
		f.createNewFile();
		System.out.println("File Created");

	}

}
