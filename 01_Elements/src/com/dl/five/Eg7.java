package com.dl.five;

public class Eg7 {

	// when to use static and instance method
	public static void main(String[] args) {
		
		getBankDetails("Axis Bank", 12345678921234L, "UTBI0004532");
		
		new Eg7().getCustomerInfo("Santosh", "Laxmi InfoBahn, Kukatpally", 1234567891L, "AGFES1367QB");
		

	}
	public static void getBankDetails(String bankName, long accountNo, String IFSC) {
		System.out.println("getBankDetails Method");
		System.out.println(bankName);
		System.out.println(accountNo);
		System.out.println(IFSC);
	}
	public void getCustomerInfo(String userName, String address, long mobileNo, String panCard) {
		System.out.println("getCustomerInfo Method");
		System.out.println(userName);
		System.out.println(address);
		System.out.println(mobileNo);
		System.out.println(panCard);
	}
}
