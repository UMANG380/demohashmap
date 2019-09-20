package com.cg.demoHashMap.ui;

import java.util.Collections;
import java.util.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Scanner;

import java.util.Iterator;

import com.cg.demoHashMap.dto.Employee;
import com.cg.demoHashMap.dto.Project;
import com.cg.demoHashMap.exception.EmployeeException;

import com.cg.demoHashMap.service.EmployeeService;
import com.cg.demoHashMap.service.EmployeeServiceImpl;



public class MyApplication {
public static void main(String[] args)  {
		
		Scanner sc = new Scanner(System.in);
		
		EmployeeService service = new EmployeeServiceImpl();
		
		Employee<Integer,Double> empOne;
		
		Project proOne;
		
		HashMap<Integer, Employee<Integer,Double>> hm = null;
		
		int choice;
		
		
		do {
			System.out.println("Enter choice");
			print();
			choice = sc.nextInt();
			switch(choice) {
			case 1:
				System.out.println("Enter id");
				Integer id = sc.nextInt();
				try {
					EmployeeServiceImpl.validateId(id);
				}catch(EmployeeException e) {
					System.out.println(e);
				}
				System.out.println("Enter project Id");
				Integer pid = sc.nextInt();
				System.out.println("Enter name");
				String name = sc.next();
				System.out.println("Enter salary");
				Double salary = sc.nextDouble();
				try {
					EmployeeServiceImpl.validateSalary(salary);
				}catch(EmployeeException e) {
					System.out.println(e);
				}
				empOne = new Employee<Integer, Double>(id,pid,name,salary);
				//proOne = new Project(prid, cost, pname);
				service.addEmployee(empOne);
				hm = service.showEmployee();
				break;
			case 2:
				
								
				Iterator<Entry<Integer, Employee<Integer, Double>>> it = hm.entrySet().iterator();
				while(it.hasNext()) {
					@SuppressWarnings("rawtypes")
					HashMap.Entry pair = (HashMap.Entry)it.next();
					System.out.println(pair);
				}
				break;
			case 3:
				
				Map<Integer, Employee<Integer, Double>> hm1 = sortByValue(hm); 
				  
		         
		        for (Map.Entry<Integer, Employee<Integer, Double>> en : hm1.entrySet()) { 
		            System.out.println("Key = " + en.getKey() +  
		                          ", Value = " + en.getValue()); 
		        } 
		        break;
			case 4:
				System.out.println("Enter the employee id you want to delete");
				int empId = sc.nextInt();
				@SuppressWarnings("unused") boolean status = service.deleteEmployee(empId);
				System.out.println("The employee detalis has been deleted");
				break;
			case 5:
				System.out.println("Enter the employee id you want to search");
				empId = sc.nextInt();
			    Employee<Integer, Double> emp =  service.searchEmployee(empId);
				System.out.println(emp);
				break;
				
			}
		} while(choice!=6);
		
}
	
	public static void print() {
		System.out.println("1:To add employee");
		System.out.println("2:Show employee");
		System.out.println("3: Sort Employee");
		System.out.println("4: Delete Employee");
		System.out.println("5: Search Employee");
		System.out.println("Exit");
	}
	public static HashMap<Integer, Employee<Integer, Double>> sortByValue(HashMap<Integer, Employee<Integer, Double>> hm) 
    { 
         
        List<Map.Entry<Integer, Employee<Integer, Double>>> list = 
               new LinkedList<Map.Entry<Integer, Employee<Integer, Double>>>(hm.entrySet()); 
  
        
        Collections.sort(list, new Comparator<Map.Entry<Integer, Employee<Integer, Double>>>() { 
            public int compare(Map.Entry<Integer, Employee<Integer, Double>> o1,  
                               Map.Entry<Integer, Employee<Integer, Double>> o2) 
            { 
                return (o1.getValue()).compareTo(o2.getValue()); 
            } 
        }); 
          
        
        HashMap<Integer, Employee<Integer, Double>> temp = new LinkedHashMap<Integer, Employee<Integer, Double>>(); 
        for (Map.Entry<Integer, Employee<Integer, Double>> aa : list) { 
            temp.put(aa.getKey(), aa.getValue()); 
        } 
        return temp; 
    } 

}
