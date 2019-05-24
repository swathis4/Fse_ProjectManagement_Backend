package com.cognizant.fse.controllertest;

import com.cognizant.fse.controller.TaskController;
import com.cognizant.fse.entity.Task;
import com.cognizant.fse.model.TaskRecord;
import com.cognizant.fse.service.TaskService;
import com.cognizant.fse.utiltest.TaskMockData;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
public class TaskControllerTest {

	@InjectMocks
	public TaskController taskController;

	@Mock
	public TaskService taskService;

	@Test
	public void saveTaskTest() {
		Mockito.when(taskService.saveTask(Mockito.any(TaskRecord.class)))
				.thenReturn(new TaskMockData().getTaskRecord());
		TaskRecord output = taskController.saveTask(new TaskMockData().getTaskRecord());
		Assert.assertEquals(new TaskMockData().getTaskRecord().getTaskName(), output.getTaskName());
		Assert.assertEquals(new TaskMockData().getTaskRecord().getProjectId(),
				output.getProjectId());

	}

	@Test
	public void getTasksTest() {
		Mockito.when(taskService.getTask()).thenReturn(new TaskMockData().getTaskList());
		List<Task> output = taskController.getTasks();
		Assert.assertEquals(2, output.size());
	}

	@Test
	public void updateTaskTest() {

		Mockito.when(taskService.updateTask(Mockito.any(Task.class), Mockito.anyLong()))
				.thenReturn(new TaskMockData().getSingleTask());
		Task output = taskController.updateTask(new TaskMockData().getSingleTask(), (long) 1);

		Assert.assertEquals(new TaskMockData().getSingleTask().getTaskId(), output.getTaskId());
	}

	@Test
	public void deleteTaskTest() {
		Mockito.when(taskService.deleteTask(Mockito.anyLong())).thenReturn("Task deleted successfully");
		String output = taskController.deleteTask((long) 1);
		Assert.assertEquals("Task deleted successfully", output);
	}

	@Test
	public void getTaskBySearchTest() {
		Mockito.when(taskService.getTaskBySearch(Mockito.anyLong()))
				.thenReturn(new TaskMockData().getTaskBySearchList());
		List<TaskRecord> output = taskController.getTaskBySearch(Mockito.anyLong());
		Assert.assertEquals(1, output.size());
	}
	
}
