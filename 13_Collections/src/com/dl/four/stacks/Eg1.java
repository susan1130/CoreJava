package com.dl.four.stacks;

import java.util.Stack;
// Stacks are synchronised. Legacy 
public class Eg1 {

	public static void main(String[] args) {
		
		Stack<String> st = new Stack<String>();
		st.add("a");
		st.add("j");
		st.add("a");
		st.add("x");
		System.out.println(st);
		
		st.add(4, "c");
		st.add(5, "a");
		st.add(6, "g");
		st.add(7, "e");
		st.add(0, "A");
		System.out.println(st);

	}

}
