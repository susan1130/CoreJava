package com.dl.one;

public class Profile {

	public String firstName;
	public String lastName;
	public String email;
	public long conatctNo;
	public String address;
	
	//constructor using fields
//	public Profile(String firstName, String lastName, String email, long conatctNo, String address) {
//		super();
//		this.firstName = firstName;
//		this.lastName = lastName;
//		this.email = email;
//		this.conatctNo = conatctNo;
//		this.address = address;
//	}
	
	//Assignment to variable has no effect and only the default values are available
//	public Profile(String firstName, String lastName, String email, long conatctNo, String address) {
//		super();
//		firstName = firstName;
//		lastName = lastName;
//		email = email;
//		conatctNo = conatctNo;
//		address = address;
//	}
	
	//this is another way of making the values use-able
	public Profile(String fName, String lName, String mail, long cNo, String add) {
		super();
		firstName = fName;
		lastName = lName;
		email = mail;
		conatctNo = cNo;
		address = add;
	}
	
	public void display() {
		System.out.println(firstName);
		System.out.println(lastName);
		System.out.println(email);
		System.out.println(conatctNo);
		System.out.println(address);		
	}
	
	public static void main(String[] args) {
		Profile pro = new Profile("Admin","Admin","cdf@gmail.com",98765432123L,"Nanakramguda Hyderabad");
		pro.display();
	}
}
