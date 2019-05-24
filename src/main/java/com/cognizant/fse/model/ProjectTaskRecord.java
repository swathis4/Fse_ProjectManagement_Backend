package com.cognizant.fse.model;


public class ProjectTaskRecord {
	
	public ProjectRecord projectRecord;
	public Long completedTask=0L;
	public Long noOfTask=0L;
	/**
	 * @return the projectRecord
	 */
	public ProjectRecord getProjectRecord() {
		return projectRecord;
	}
	/**
	 * @param projectRecord the projectRecord to set
	 */
	public void setProjectRecord(ProjectRecord projectRecord) {
		this.projectRecord = projectRecord;
	}
	/**
	 * @return the completedTask
	 */
	public Long getCompletedTask() {
		return completedTask;
	}
	/**
	 * @param completedTask the completedTask to set
	 */
	public void setCompletedTask(Long completedTask) {
		this.completedTask = completedTask;
	}
	/**
	 * @return the noOfTask
	 */
	public Long getNoOfTask() {
		return noOfTask;
	}
	/**
	 * @param noOfTask the noOfTask to set
	 */
	public void setNoOfTask(Long noOfTask) {
		this.noOfTask = noOfTask;
	}
	
	

}
