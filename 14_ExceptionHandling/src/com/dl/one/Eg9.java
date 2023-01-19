package com.dl.one;
//  try ..throw .. catch... finally
public class Eg9 {

	public static void getCoupon(String coupon){
		
		if(coupon != "AXE01023") {
			try {
				throw new Exception("Coupon mismatch");
			}
			catch (Exception e){
				System.out.println(e);
			}
			finally {
				System.out.println("Finally Block");
				//code that executes after the try catch block is written here
			}
		}
		else {
			System.out.println("Coupon accepted");
		}
	}
	
	public static void main(String[] args) {
		
		getCoupon("AXE01003");

	}

}
