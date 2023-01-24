package com.dl.one;

@FunctionalInterface
interface Signin{
	public abstract void login();
}

class UserOne implements Signin{

	@Override
	public void login() {
		System.out.println("Login method called");
		
	}
	
} 

public class Eg7 {

	public static void main(String[] args) {
		
		//Constructor
		//login method called
		UserOne uo = new UserOne();
		uo.login();
		
		//polymorphism
		//login method called
		Signin si = new UserOne();
		si.login();
		
		//Anonymous Inner type implement
		//login method over-ridden and then called
		Signin s = new Signin() {

			@Override
			public void login() {
				System.out.println("Login Method Over-ridden");
				
			}
			
		};
		s.login();

	}

}
