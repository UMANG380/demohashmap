package com.cg.demoHashMap.dto;

public class Department {
	
	int deptId;
	String deptName;
	
	public int getDeptId() {
		return deptId;
	}

	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public Employee<?, ?> getEmp() {
		return emp;
	}

	public void setEmp(Employee<?, ?> emp) {
		this.emp = emp;
	}

	public Department(int deptId, String deptName, Employee<?, ?> emp) {
		super();
		this.deptId = deptId;
		this.deptName = deptName;
		this.emp = emp;
	}

	Employee<?, ?> emp;

}
