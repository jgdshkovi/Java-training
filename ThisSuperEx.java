package com.fis.oops;

class Parent {
	int age = 90;
	public Parent()
	{
	System.out.println("parent class default ...");
	}
	public Parent(int a)
	{
		this();
	System.out.println("parent class param... : "+a);
	}
	public void m1() {
		System.out.println("parent method");
	}
	public void m1(int x) {
		System.out.println("parent method");
	}
}

public class ThisSuperEx extends Parent {
	int age = 122;

	public ThisSuperEx() {
		super(45);
		System.out.println("default constructor");
	}

	public ThisSuperEx(String name) {
		this();
		System.out.println(this);
		System.out.println("param constructor :" + name);
	}
	public void m1() {
		System.out.println("child method");
	}

	public void displayMsg(int age) {
		this.m1();
		super.m1();
		System.out.println(this.age + "am of constructorex class :" + age + " parent age value :" + super.age);
	}

	public static void main(String[] args) {

		ThisSuperEx obj = new ThisSuperEx();
		System.out.println(obj);//object address
		obj.displayMsg(121);
	}

}
