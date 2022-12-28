package com.dl.one;

public class Eg14 {
	//split() method and join() method

	public static void main(String[] args) {
		
//		String s1 = "A quick running fox jumped over a sleeping dog.";
//		String[] s = s1.split(" ");
//		for (String ss : s) {
//			System.out.println(ss);
//		}
		
//		String s1 = "A quick over running fox jumped over a sleeping dog.";
//		String[] s = s1.split("over");
//		for (String ss : s) {
//			System.out.println(ss);
//		}
//		
//		String s1 = "A quick running: fox jumped: over a :sleeping dog.";
//		String[] s = s1.split(":");
//		for (String ss : s) {
//			System.out.println(ss);
//		}
		
		String s1 = "A quick: running fox: jumped over: a sleeping dog.";
		String[] s = s1.split(":" , 2);
		for (String ss : s) {
			System.out.println(ss);
		}
		
		String st = String.join(":","I", "am","liking", "Java","Programming");
		System.out.println(st);

	}

}
