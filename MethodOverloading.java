package com.fis.oops;

public class MethodOverloading {
	
	public void add(double a, double b) {
		System.out.println("add of two int's : " + (a + b));
	}
	
	public static void main(String[] args) {
		MethodOverloading obj = new MethodOverloading();

		obj.add(12.4f, 13.8f);
		
	}
}
