package com.dl.four;

public abstract class Client {
	public Client() {
		System.out.println("Default Constructor1");
	}
	public static void main(String[] args) {
		new Client() {};
	}
}
