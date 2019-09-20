package com.cg.demoHashMap.service;
import com.cg.demoHashMap.exception.*;
import java.util.HashMap;
import com.cg.demoHashMap.dao.*;
import com.cg.demoHashMap.dto.Employee;


public class EmployeeServiceImpl implements EmployeeService {
	EmployeeDao dao = new EmployeeDaoImpl();

	public Employee<Integer, Double> addEmployee(Employee<Integer, Double> emp)  {
		
		
		return dao.addEmployee(emp);
		
	}

	public HashMap<Integer, Employee<Integer, Double>> showEmployee() {
		return dao.showEmployee();
	}

	public boolean deleteEmployee(int empId) {
		
		return dao.deleteEmployee(empId);
	}
	public Employee<Integer, Double> searchEmployee(int empId){
		return dao.searchEmployee(empId);
	}
	
	public static void validateSalary(double salary) throws EmployeeException{
	  if(salary<10000) {
		  throw new EmployeeException("Salary should be greater than 10000");
	  }
	}
	  public static void validateId(Integer id) throws EmployeeException{
		  if(id<1000 || id >9999) {
		  throw new EmployeeException("Id should be of 4 digits");
		  }
	  }
	}
	


