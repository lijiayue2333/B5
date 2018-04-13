package com.cg.eis.service;

import com.cg.eis.bean.Employee;

public class EmployeeServiceC implements EmployeeService {
	Employee e;
	public EmployeeServiceC(Employee emp) {
		e = emp;
	}
	public void getEmployeeDetails() {
		System.out.println(e.toString());
	}
	public void findScheme(double salary, String designation) {
		if(e.getSalary() == salary && e.getDesignation().equals(designation)) {
			System.out.println(e.getInsuranceScheme());
		}
		else {
			System.out.println("Not Find!");
		}
	}
}
