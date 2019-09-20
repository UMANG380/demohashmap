package com.cg.demoHashMap.dao;

import java.util.HashMap;

import com.cg.demoHashMap.dto.Employee;
import com.cg.demoHashMap.dto.Project;

public class ProjectDaoImpl implements ProjectDao {
	
	HashMap<Integer, Project> hm1 = new HashMap<Integer, Project>();


	public Project addProject(Project pro) {
		hm1.put(pro.getProjectId(), pro);
		
		return pro;
	}

	public HashMap<Integer, Project> showProject() {
		// TODO Auto-generated method stub
		return hm1;
	}

	public boolean deleteProject(int projectId) {
		if(hm1.remove(projectId)!=null)
			return true;
		else
			return false;
	}

	public Project searchProject(int projectId) {
		return hm1.get(projectId);
	}
	public boolean addEmployeeToProject(int projectId, Employee<Integer, Double> emp) {
		hm1.get(projectId).addEmployee1(emp);
		return true;
	}
	

}
