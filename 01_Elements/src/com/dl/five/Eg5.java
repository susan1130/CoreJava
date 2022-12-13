package com.dl.five;

public class Eg5 {

	String productName = "One Plus";
	String productDescription = "One plus 9 mobile phone.";
	static float productPrice = 36000f;
	float productDiscount =  2000f;
	float priceAfterDiscount = productPrice-productDiscount;
	
	public static void main(String[] args) {
		
		new Eg5().order();

	}

	public void order() {
		System.out.println(productName);
		System.out.println(productDescription);
		System.out.println(priceAfterDiscount);
	}
}
