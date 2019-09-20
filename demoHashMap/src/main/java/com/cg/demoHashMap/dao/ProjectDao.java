package com.cg.demoHashMap.dao;

import java.util.HashMap;

import com.cg.demoHashMap.dto.Employee;
import com.cg.demoHashMap.dto.Project;

public interface ProjectDao {
	
public Project addProject(Project pro);
	
	public HashMap<Integer, Project> showProject();
	public boolean deleteProject(int projectId);
	public Project searchProject(int projectId);
	public boolean addEmployeeToProject(int projectId, Employee<Integer, Double> emp);

}
