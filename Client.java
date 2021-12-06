package com.fis.oops;

public class Client {
public static void main(String[] args) {
	Employee emp=new Employee();
	emp.setEid(123);
	emp.setEname("sandeep");
	emp.setEsal(9000);
	emp.setAddress("hyd");
	
	System.out.println(emp.getEid()+ " "+emp.getEname());
}
}
