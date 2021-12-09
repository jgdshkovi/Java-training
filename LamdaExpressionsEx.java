package com.java8;
@FunctionalInterface
interface Caluculator{
	int add(int a,int b);
	default void m1()
	{	
	}
	static void m2()
	{		
	}
}
public class LamdaExpressionsEx {
public static void main(String[] args) {
	Caluculator cal=(a,b)->a-b;
	System.out.println(cal.add(1, 3));
}
}
