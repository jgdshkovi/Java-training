package com.fis.oops;

import java.util.Date;
interface Calc{//100%
	int a=123;//public static final int a=123;
	void add();//public abstract void m1();
	void sub();//public abstract void m2();
}
abstract class A  implements Calc{//0-100
	public void displayMsg()
	{
		System.out.println("welcome to oops.........");
	}
	public abstract void displayTime();
}

public  class Test extends A{
	
	public void displayDate()
	{
		System.out.println("Today's  Date :"+new Date());
	}
	public static void main(String[] args) {
		Test test=new Test();
		test.displayDate();
		test.displayTime();
	}
	@Override
	public void displayTime() {
		Date date=new Date();
		System.out.println(date.getHours()+" : "+date.getMinutes()+" : "+date.getSeconds());
	}
	@Override
	public void add() {
	int a=123;
	int b=234;
	System.out.println("addition of two numbers "+ (a+b));
	}
	@Override
	public void sub() {
		int a=123;
		int b=234;
		System.out.println("addition of two numbers "+ (a-b));
	}

}
