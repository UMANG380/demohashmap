package com.cg.demoHashMap.dao;

import java.util.HashMap;
import com.cg.demoHashMap.dto.*;



public interface EmployeeDao {
	
public Employee<Integer, Double> addEmployee(Employee<Integer, Double> emp);
	
	public HashMap<Integer, Employee<Integer,Double>> showEmployee();
	public boolean deleteEmployee(int empId);
	public Employee<Integer, Double> searchEmployee(int empId);
	
	
	
	

}
