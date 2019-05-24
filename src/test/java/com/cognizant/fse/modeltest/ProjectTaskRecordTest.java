package com.cognizant.fse.modeltest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.cognizant.fse.model.ProjectRecord;
import com.cognizant.fse.model.ProjectTaskRecord;

@RunWith(SpringJUnit4ClassRunner.class)
public class ProjectTaskRecordTest {
	
	@Test
	public void testProjectTaskRecord() {
		ProjectTaskRecord test = new ProjectTaskRecord();
		test.setCompletedTask(1l);
		assertEquals(Long.valueOf(1),test.getCompletedTask());
		test.setNoOfTask(1l);
		assertEquals(Long.valueOf(1),test.getNoOfTask());
		ProjectRecord projectRecord = new ProjectRecord();
		test.setProjectRecord(projectRecord);
		assertEquals(projectRecord,test.getProjectRecord());
		
	}

}
