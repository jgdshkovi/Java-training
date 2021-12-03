package com.fis.core;
//java.lang,java.lang.Object
import java.util.Date;
class A
{
	public void m1()
	{
		System.out.println("am from A class m1 method");
	}
}
class Parent extends A
{
	int salary=9000;
	public void displayDate()
	{
		System.out.println("Today's Date :"+new Date());
	}
	public String displayMsg()
	{
		return "we started sleeping";
	}
}
public class Test extends Parent{
	public void message()
	{
		System.out.println("welcome to oops........");
	}
	public static void main(String[] args) {
		Test test=new Test();
		test.message();
		test.displayDate();//java.lang
		System.out.println(test.salary);
		System.out.println(test.displayMsg());
		test.toString();
	}

}
