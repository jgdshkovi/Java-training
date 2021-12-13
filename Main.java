package com.cg.demo;

import java.util.Iterator;
import java.util.List;

public class Main extends EmployeeService{

	public static void main(String[] args) {

		EmployeeService service = new EmployeeService();
		double threshold = 60000.0;
		String city = "Pune";
		
		//call the functions
		
		//get emp
		Employee emp = service.getEmployee(112233, "Kavita");
		System.out.println(emp.toString());
		System.out.println("--------------------");
		
		//sal greater than given amount
		List<Employee> lis = service.getEmployees(threshold);
		Iterator<Employee> itr = lis.iterator();
		System.out.println("Employes whose salary greater than "+threshold);
		while(itr.hasNext()) {
			Employee ee =  itr.next();
			System.out.println(ee.getName());
		}
		System.out.println("--------------------");
		
		//get max salary
		System.out.println("Max Salary is: "+service.getMaxSalary());
		System.out.println("--------------------");
		
		//
		System.out.println("Sum of Salaries: "+service.getSumOfSalary());
		System.out.println("--------------------");
		
		//
		System.out.println("Emps from city "+city+": ");
		List<String> lis1 = service.getNames(city);
		Iterator<String> itr1 = lis1.iterator();
		while(itr1.hasNext()) {
			System.out.println(itr1.next());
		}
		System.out.println("--------------------");
		
		//details -- in salary ascending order
		System.out.println("Emps in ascen order of Salary: ");
		List<Employee> lis2 = service.getDetails();
		Iterator<Employee> itr2 = lis2.iterator();
		while(itr2.hasNext()) {
			Employee e = itr2.next();
			System.out.println(e.getSalary()+" - "+e.getName());
		}
		System.out.println("--------------------");
		
		// Managers
		System.out.println("Managers: ");
		List<Employee> lis3 = service.getManagers();
		Iterator<Employee> itr3 = lis3.iterator();
		while(itr3.hasNext()) {
			Employee m = itr3.next();
			System.out.println(m.getName());
		}
		System.out.println("--------------------");
		
		// Sum of manager salaries
		System.out.println("Sum of Manager Salaries: "+service.getSumOfManagerSalaries());
		System.out.println("--------------------");
		
		//IDs of all emps
		System.out.println("IDs of all emps:");
		List<String> lis4 = service.getIds();
		Iterator<String> itr4 = lis4.iterator();
		while(itr4.hasNext()) {
			System.out.println(itr4.next());
		}
		System.out.println("--------------------");
		
	}

}
