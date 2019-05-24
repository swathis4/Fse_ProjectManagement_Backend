package com.cognizant.fse.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.fse.entity.Project;
import com.cognizant.fse.model.ProjectRecord;
import com.cognizant.fse.model.ProjectTaskRecord;
import com.cognizant.fse.service.ProjectService;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/projectmanager/projects")
public class ProjectController { 
	
	@Autowired
	private ProjectService projectService;
	
	@PostMapping("/saveProject")
	public ProjectRecord saveProject(@RequestBody ProjectRecord projectRecord){
		return projectService.saveProject(projectRecord);
	}
	
	@GetMapping("/getProjects")
    public List<Project> getAllProjectRecords() {
    	return projectService.findAllProjects();
    }
	
	@GetMapping("/getTaskProjects")
    public List<ProjectTaskRecord> getAllProjects() {
    	return projectService.findAllRecords();
    }
	
	@PutMapping("/updateProject/{id}")
	public Project updateProject(@RequestBody Project project, @PathVariable ("id") Long projectId){
		return projectService.updateProject(project, projectId);
	}
	
	@PutMapping("/deleteProject/{id}")
	public String deleteProject(@PathVariable ("id") Long projectId){
		return projectService.deleteProject(projectId);
	}
}
