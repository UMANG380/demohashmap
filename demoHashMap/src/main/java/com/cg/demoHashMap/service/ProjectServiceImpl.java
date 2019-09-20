package com.cg.demoHashMap.service;

import java.util.HashMap;


import com.cg.demoHashMap.dao.ProjectDao;
import com.cg.demoHashMap.dao.ProjectDaoImpl;
import com.cg.demoHashMap.dto.Project;

public class ProjectServiceImpl implements ProjectService {
	
	ProjectDao dao = new ProjectDaoImpl();

	public Project addProject(Project pro) {
		return dao.addProject(pro);
	}

	public HashMap<Integer, Project> showProject() {
		return dao.showProject();
	}

	public boolean deleteProject(int projectId) {
		return dao.deleteProject(projectId);
	}

	public Project searchProject(int projectId) {
		return dao.searchProject(projectId);
	}

	
	

}
