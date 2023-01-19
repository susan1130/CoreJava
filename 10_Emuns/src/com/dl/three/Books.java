package com.dl.three;

public enum Books {

	JavaBook, PythonBook, JavaScriptBook, ReactJSBook;

	public static void main(String[] args) {
		
		Books[] v = Books.values();
		for (Books b : v) {
			System.out.println(b);
			System.out.println(b.ordinal());
		}
		Books vv = Books.valueOf("JavaBook");
		System.out.println(vv);
	}
}

