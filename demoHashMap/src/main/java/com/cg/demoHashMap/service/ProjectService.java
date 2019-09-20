package com.cg.demoHashMap.service;

import java.util.HashMap;


import com.cg.demoHashMap.dto.Project;

public interface ProjectService {
	
	public Project addProject(Project pro) ;
	public HashMap<Integer, Project> showProject();
	public boolean deleteProject(int projectId);
	public Project searchProject(int projectId);

}
