package com.dl.one;

public class RegisterImplt extends Register {

	public static void main(String[] args) {
		
		RegisterImplt rI = new RegisterImplt();
		rI.setId(20220001);
		rI.setUsername("Happilo");
		rI.setPhnNo(12346578904L);
		rI.setEmail("abc@gmail.com");
		rI.setAddress("Hyd 13 Amazon Campus, Financial District, Hyderabad");
		
		System.out.println(rI.getId());
		System.out.println(rI.getUsername());
		System.out.println(rI.getPhnNo());
		System.out.println(rI.getEmail());
		System.out.println(rI.getAddress());
	}
}
