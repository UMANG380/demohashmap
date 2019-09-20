package com.cg.demoHashMap.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.cg.demoHashMap.dto.Employee;
import com.cg.demoHashMap.dto.Project;

public class EmployeeDaoImpl implements EmployeeDao {

	HashMap<Integer, Employee<Integer, Double>> hm = new HashMap<Integer, Employee<Integer, Double>>();
    List<Project> plist = new ArrayList<Project>();
    
	public Employee<Integer, Double> addEmployee(Employee<Integer, Double> emp) {
		hm.put(emp.getEmpId(), emp);
		//System.out.println(list);
		return emp;
	}

	public HashMap<Integer, Employee<Integer, Double>> showEmployee() {
		return hm ;
	}
	
	public boolean deleteEmployee(int empId) {
		if(hm.remove(empId)!=null)
			return true;
		else
			return false;
	}
	public Employee<Integer, Double> searchEmployee(int empId) {
		return hm.get(empId);
			
		
	}

	
	
}
