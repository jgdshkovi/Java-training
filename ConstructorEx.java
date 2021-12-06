package com.fis.oops;

import java.util.Date;

public class ConstructorEx {

	public ConstructorEx(){
		System.out.println("default constructor");
	}
	public ConstructorEx(String name){
		System.out.println("param constructor :"+name);
	}
	public static void displayTime() {
		Date date=new Date();
		System.out.println(date.getHours()+" : "+date.getMinutes()+" : "+date.getSeconds());
	}
	public  void displayDate() {
		Date date=new Date();
		System.out.println(date);
	}
	public static void main(String[] args) {
		
		ConstructorEx.displayTime();
		ConstructorEx obj1=new ConstructorEx();
		ConstructorEx obj=new ConstructorEx("sleeping");
		obj.displayDate();
	}
	
	
	
}
