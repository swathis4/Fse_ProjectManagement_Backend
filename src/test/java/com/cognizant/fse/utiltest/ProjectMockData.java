package com.cognizant.fse.utiltest;

import com.cognizant.fse.entity.Project;
import com.cognizant.fse.model.ProjectRecord;
import com.cognizant.fse.model.ProjectTaskRecord;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ProjectMockData {

	public Project getSingleProject() {

		Project p = new Project();
		p.setUserId((long) 1);
		p.setProjectName("DummyProject");
		p.setStartDate(java.sql.Date.valueOf(LocalDate.parse("2019-04-01")));
		p.setEndDate(java.sql.Date.valueOf(LocalDate.parse("2019-04-20")));
		p.setPriority(1);
		p.setStatus("N");
		return p;

	}

	public ProjectRecord getProjectRecord() {
		ProjectRecord project = new ProjectRecord();
		project.setProjectName("DummyProject");
		project.setStartDate(java.sql.Date.valueOf(LocalDate.parse("2019-04-01")));
		project.setEndDate(java.sql.Date.valueOf(LocalDate.parse("2019-04-20")));
		project.setPriority(1);
		project.setUserId(1L);
		project.setUserName("Dummy name");
		return project;
	}

	public Project getSingleProjectWithoutProjectId() {

		return new Project("DummyProject", java.sql.Date.valueOf(LocalDate.parse("2019-04-01")),
				java.sql.Date.valueOf(LocalDate.parse("2019-04-20")), 1);
	}

	public List<Project> getProjectList() {

		List<Project> projectList = new ArrayList<Project>();

		projectList.add(new Project((long) 1, "DummyProject", java.sql.Date.valueOf(LocalDate.parse("2019-04-01")),
				java.sql.Date.valueOf(LocalDate.parse("2019-04-20")), 1, (long)1, "N"));

		projectList.add(new Project((long) 2, "DummyProject2", java.sql.Date.valueOf(LocalDate.parse("2019-04-01")),
				java.sql.Date.valueOf(LocalDate.parse("2019-04-20")), 1,(long)1, "N"));

		return projectList;
	}

	public List<ProjectTaskRecord> getProjectTaskList() {

		List<ProjectTaskRecord> projectList = new ArrayList<ProjectTaskRecord>();
		
		ProjectTaskRecord ptask=new ProjectTaskRecord();
		ptask.setProjectRecord(new ProjectMockData().getProjectRecord());
		ptask.setCompletedTask(1l);
		ptask.setNoOfTask(3l);
		projectList.add(ptask);
		
		ProjectTaskRecord ptask1=new ProjectTaskRecord();
		ptask1.setProjectRecord(new ProjectMockData().getProjectRecord());
		ptask1.setCompletedTask(2l);
		ptask1.setNoOfTask(3l);
		projectList.add(ptask1);

		return projectList;
	}

	public String getProjectName() {
		return "Dummy Project";
	}

}
