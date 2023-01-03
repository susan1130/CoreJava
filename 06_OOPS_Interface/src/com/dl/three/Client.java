package com.dl.three;

public class Client {

	public static void main(String[] args) {

		ProfileImplt pro = new ProfileImplt();
		pro.m1();
		pro.m2();
		pro.m3();
		pro.m4();
		System.out.println("   ---------   ");
		
		ProfileOne p1 = new ProfileImplt();
		p1.m1();
		p1.m2();
		System.out.println("   ---------   ");
		
		ProfileTwo p2 = new ProfileImplt();
		p2.m3();
		p2.m4();
	}

}
