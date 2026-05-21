package com.training;

public class ExpDemo {

	public static void main(String[] args) {
		int x = 0;
		int y= 1;
		try {
			y = 8/x;
		}
		
		catch(ArithmeticException e) {
		System.out.println("ArithmetExcrption caught");
		
		}
		finally {
			System.out.println("Finally block");
		}
		System.out.println("value of y is:"+y);
	}

}
