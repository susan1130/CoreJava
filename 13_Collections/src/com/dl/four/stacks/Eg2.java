package com.dl.four.stacks;

import java.util.Stack;

public class Eg2 {

	public static void main(String[] args) {
		
		Stack<String> st = new Stack<String>();
		st.push("A");
		st.push("j");
		st.push("a");
		st.push("x");
		st.push("K");
		st.push("i");
		st.push("n");
		st.push("g");
		System.out.println(st);
		
		System.out.println("Element on top of the stack is : "+st.peek());
		System.out.println("Index of K in the stack is : "+ st.search("K"));
		
		System.out.println("Is the stack empty: "+ st.empty());
		
		st.pop();
		st.pop();
		System.out.println("Stack after popping 2 elements: "+ st);
		
		System.out.println("Clearing the stack.");
		st.clear();
		System.out.println("Is the stack empty: "+ st.empty());

	}

}
