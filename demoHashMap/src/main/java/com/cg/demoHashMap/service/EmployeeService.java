package com.cg.demoHashMap.service;

import java.util.HashMap;



import com.cg.demoHashMap.dto.Employee;



public interface EmployeeService {
	
	public Employee<Integer, Double> addEmployee(Employee<Integer, Double> emp) ;
	public HashMap<Integer, Employee<Integer,Double>> showEmployee();
	public boolean deleteEmployee(int empId);
	public Employee<Integer, Double> searchEmployee(int empId);

}
