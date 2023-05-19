package com.actitime.testscript;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;
import com.actitime.generic.FileLib;
import com.actitime.pom.HomePage;
import com.actitime.pom.TaskListPage;

@Listeners(com.actitime.generic.ListnerImplimentation.class)
public class ProjectModule1 extends BaseClass{
	@Test
	public void createProject() throws Exception {
		Reporter.log("createProject",true);
		FileLib f=new FileLib();
		String prjctName = f.getExceldata("CreateProject", 1, 3);
		String prjctDescp=f.getExceldata("CreateProject", 1, 4);
		HomePage h=new HomePage(driver);
		h.setTaskTab();
		TaskListPage t=new TaskListPage(driver);
		t.getAddNew().click();
		t.getNewProject().click();
		t.getEnterProjectName().sendKeys(prjctName);
		t.getEnterProjectDescription().sendKeys(prjctDescp);
		t.getSelectProjectDD().click();
		t.getOurCompany().click();
		t.getCreateProject().click();
		Thread.sleep(4000);
		String actualText = t.getActualCustomerCreated().getText();
		Assert.assertEquals(actualText, prjctName);
}
}
