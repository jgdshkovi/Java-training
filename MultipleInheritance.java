package com.fis.oops;
interface A1{
	
	void m1() ;
	
}
interface B1{
	void m1();
	
	
}
public class MultipleInheritance implements A1,B1  {

	public static void main(String[] args) {
		MultipleInheritance wel=new MultipleInheritance();
		wel.m1();
	}

	@Override
	public void m1() {
		System.out.println("Am from welcome class m1");
	}
}
