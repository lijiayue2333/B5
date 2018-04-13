package com.cg.eis.pl;

import com.cg.eis.bean.Employee;
import com.cg.eis.service.EmployeeServiceC;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e = new Employee();
		e.setId(1);
		e.setFirstName("Jane");
		e.setLastName("Brown");
		e.setSalary(1000.0);
		e.setDesignation("HR");
		e.setInsuranceScheme("Suns");
		EmployeeServiceC es = new EmployeeServiceC(e);
		es.getEmployeeDetails();
		es.findScheme(1000.0, "HR");
		
		
	}

}
