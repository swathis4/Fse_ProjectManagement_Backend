package com.cognizant.fse.model;

public class ParentTaskRecord {
	
	public long id;
	public String taskName;
	public TaskRecord task;
	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}
	/**
	 * @return the taskName
	 */
	public String getTaskName() {
		return taskName;
	}
	/**
	 * @param taskName the taskName to set
	 */
	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}
	/**
	 * @return the task
	 */
	public TaskRecord getTask() {
		return task;
	}
	/**
	 * @param task the task to set
	 */
	public void setTask(TaskRecord task) {
		this.task = task;
	}
	
	
	
	
	
}
