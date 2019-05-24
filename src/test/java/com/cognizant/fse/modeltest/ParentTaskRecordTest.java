package com.cognizant.fse.modeltest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.cognizant.fse.model.ParentTaskRecord;
import com.cognizant.fse.model.TaskRecord;

@RunWith(SpringJUnit4ClassRunner.class)
public class ParentTaskRecordTest {
	
	@Test
	public void testModel() {
		ParentTaskRecord test = new ParentTaskRecord();
		test.setId(1l);
		assertEquals(1l,test.getId());
		TaskRecord task= new TaskRecord();
		test.setTask(task);
		assertEquals(task,test.getTask());
		test.setTaskName("swathi");
		assertEquals("swathi",test.getTaskName());
	}
	

}
