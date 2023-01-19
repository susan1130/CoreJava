package com.dl.one;

public class Eg7 {

	public static void main(String[] args) {
		
		try {
			int a = 10;
			int b = 20;
			int c = 30;
			System.out.println(a+b);
			System.out.println(a/c);
			
			int i[] = {1,2,3,4,5};
			System.out.println(i[2]);
			System.out.println(i[20]);
			
			String s = "10";
			int pi = Integer.parseInt(s);
			System.out.println(pi);
			
			String ss = "Hello WORLD, hej world";
			System.out.println(ss.charAt(8));
			System.out.println(ss.charAt(15));
		} 
		catch (ArithmeticException e) {
			System.out.println(e);
		}
		catch (ArrayIndexOutOfBoundsException e){
			System.out.println(e);
		}
		catch (NumberFormatException e){
			System.out.println(e);
		}
		catch (NullPointerException e){
			System.out.println(e);
		}
		catch (StringIndexOutOfBoundsException e){
			System.out.println(e);
		}

	}

}
