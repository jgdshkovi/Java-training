package com.cg.demo;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
//import java.util.function.Predicate;
//import java.util.TreeSet;

public class EmployeeService {

	List<Employee> list = EmployeeRepository.getEmployees();

	public Employee getEmployee(int id, String name) {
		//display the Employee details based on id or name
		Iterator<Employee> itr = this.list.iterator();
		while(itr.hasNext()) {
			Employee ee = itr.next();
			if(ee.getId()==id) {
//				System.out.println(ee.toString());
				return ee;
			}
		}
		return null;
	}

	public List<Employee> getEmployees(Double salary) {
		// display the names of employees who are getting the salary greater than the 60000
		// salary given
		Iterator<Employee> itr = list.iterator();
		List<Employee> li = new ArrayList<>();
		while(itr.hasNext()) {
			Employee ee = itr.next();
			if(ee.getSalary()>=salary) {
				li.add(ee);
			}
		}
		return li;
	}

	public Double getMaxSalary() {
		// display the max salary
		Iterator<Employee> itr = list.iterator();
		double maxSal = -10000;
		while(itr.hasNext()) {
			Employee ee = itr.next();
			if(ee.getSalary() >= maxSal) {
				maxSal = ee.getSalary();
			}
		}
		return maxSal;
	}

	public Double getSumOfSalary() {
		// display the sum of salaries of all the employees
		Iterator<Employee> itr = list.iterator();
		double total = 0;
		while(itr.hasNext()) {
			Employee ee = itr.next();
			total += ee.getSalary();
		}
		return total;

	}

	public List<String> getNames(String city) {
		// display the names of all employees who are working in 'Pune'
		Iterator<Employee> itr = list.iterator();
		List<String> names = new ArrayList<>();
		while(itr.hasNext()) {
			Employee ee = itr.next();
			if(ee.getLocation().equalsIgnoreCase(city)) {
				names.add(ee.getName());
			}
		}
		return names;
	}

	public List<Employee> getDetails() {
		// display all employees based on salary ascending
		list.sort(Comparator.comparing(Employee::getSalary));
		return list;
	}

	public List<Employee> getManagers() {
		// display all employees who are working as managers
		Iterator<Employee> itr = list.iterator();
		List<Employee> mng = new ArrayList<>();
		while(itr.hasNext()) {
			Employee ee = itr.next();
			if(ee.getDesignation().equalsIgnoreCase("Manager")) {
				mng.add(ee);
			}
		}
		return mng;
	}

	public Double getSumOfManagerSalaries() {
		// display the sum of salaries of employees who are working as managers
		List<Employee> mngr = getManagers();
		double tot = 0;
		Iterator<Employee> itr = mngr.iterator();
		while(itr.hasNext()) {
			Employee ee = itr.next();
			tot += ee.getSalary();
		}
		return tot;
	}

	public List<String> getIds() {
		// display the ids of all employees
		Iterator<Employee> itr = list.iterator();
		List<String> ids= new ArrayList<>();
		while(itr.hasNext()) {
			Employee ee = itr.next();
			ids.add(ee.getId()+" - "+ee.getName());
		}
		
		return ids;
	}
}
