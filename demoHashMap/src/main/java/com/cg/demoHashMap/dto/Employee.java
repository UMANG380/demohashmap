package com.cg.demoHashMap.dto;

import java.util.Comparator;
import java.util.List;

public class Employee<T,K> {
	
	T empId;
	String empName;
	K empSalary;
	
	public Employee(T empId, Integer pid, String empName, K empSalary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
	}

	public Employee() {
	}

	public T getEmpId() {
		return empId;
	}

	public void setEmpId(T empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public K getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(K empSalary) {
		this.empSalary = empSalary;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empSalary=" + empSalary + "]";
	}
	
	public static <T,K> boolean isEqual(T t,K k){
		return false;
	}
	
	public static void UpperBound(List<? extends Number> list) {
		System.out.println("Lower Bound");
	}
	
	public static void LowerBound(List<? super Integer> list) {
		System.out.println("Upper Bound");
	}
	
	public static void NoBound(List<?> list) {
		for(Object l:list)
			System.out.print(l);
		System.out.println();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((empId == null) ? 0 : empId.hashCode());
		result = prime * result + ((empName == null) ? 0 : empName.hashCode());
		result = prime * result + ((empSalary == null) ? 0 : empSalary.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (empId == null) {
			if (other.empId != null)
				return false;
		} else if (!empId.equals(other.empId))
			return false;
		if (empName == null) {
			if (other.empName != null)
				return false;
		} else if (!empName.equals(other.empName))
			return false;
		if (empSalary == null) {
			if (other.empSalary != null)
				return false;
		} else if (!empSalary.equals(other.empSalary))
			return false;
		return true;
	}
	
	

	/*public int compareTo(Employee<T, K> o) {
		if((Double)this.empSalary>(Double)o.empSalary)
			return +1;
		else if(this.empSalary==o.empSalary)
			return 0;
		return -1;
		
	//	return this.empName.compareTo(o.empName);
	}*/

	public int compare(Employee<T, K> o1, Employee<T, K> o2) {
		if((Double)o1.empSalary>(Double)o2.empSalary)
			return +1;
		else if(o1.empSalary==o2.empSalary)
			return 0;
		return -1;
		//return o1.empName.compareTo(o2.empName);
		
	}

	public int compareTo(Employee<Integer, Double> value) {
		
		return this.empName.compareTo(value.empName);
	}
	
}
