package com.cg.demoHashMap.dto;

import java.util.HashMap;
import com.cg.demoHashMap.dto.*;

public class Project {
	
	int projectId;
	double projectCost;
	String projectName;
	
	HashMap<Integer, Employee> listOfEmployees;
	public Project(int projectId, double projectCost, String projectName, HashMap<Integer, Employee> listOfEmployees) {
		super();
		this.projectId = projectId;
		this.projectCost = projectCost;
		this.projectName = projectName;
		this.listOfEmployees = listOfEmployees;
	}
	public int getProjectId() {
		return projectId;
	}
	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}
	public double getProjectCost() {
		return projectCost;
	}
	public void setProjectCost(double projectCost) {
		this.projectCost = projectCost;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public HashMap<Integer, Employee> getListOfEmployees() {
		return listOfEmployees;
	}
	public void setListOfEmployees(HashMap<Integer, Employee> listOfEmployees) {
		this.listOfEmployees = listOfEmployees;
	}
	@Override
	public String toString() {
		return "Project [projectId=" + projectId + ", projectCost=" + projectCost + ", projectName=" + projectName
				+ ", listOfEmployees=" + listOfEmployees + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((listOfEmployees == null) ? 0 : listOfEmployees.hashCode());
		long temp;
		temp = Double.doubleToLongBits(projectCost);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + projectId;
		result = prime * result + ((projectName == null) ? 0 : projectName.hashCode());
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
		Project other = (Project) obj;
		if (listOfEmployees == null) {
			if (other.listOfEmployees != null)
				return false;
		} else if (!listOfEmployees.equals(other.listOfEmployees))
			return false;
		if (Double.doubleToLongBits(projectCost) != Double.doubleToLongBits(other.projectCost))
			return false;
		if (projectId != other.projectId)
			return false;
		if (projectName == null) {
			if (other.projectName != null)
				return false;
		} else if (!projectName.equals(other.projectName))
			return false;
		return true;
	}
	public boolean addEmployee1(Employee<Integer, Double> emp) {
		listOfEmployees.put(emp.getEmpId(), emp);
		return true;
		
	}
	
	
	
	
	

}
