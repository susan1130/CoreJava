package com.dl.one;

// lambda expressions, method references
//lambda block

@FunctionalInterface
interface UserName{
	public String userName(String name, String password);
}

public class Eg6 {

	public static void main(String[] args) {
		
		UserName uNAme = (uN,pW) -> {
			return uN + pW;
		};
		System.out.println(uNAme.userName("Researcher", " Research@1"));
	}

}
