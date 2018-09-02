package com.ranford.functionalities;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestExecution extends Repository{

	@Test(priority=1)
	public void verify_launch()
	{  
		launch_Application();
	}
	
	@Test(priority=2)
	public void verify_login()
	{
		login_Application();
	}
	
/*	@Test(priority=3, enabled=true)
	public void verifyCreateNewBranch()
	{
		clickbranches();
		//createNewBranch();
	}
	
*/
	@DataProvider(name="branch")
	public Object[][] verify_excelContent() throws IOException
	{
		return excelContent("TestData.xls","Sheet1");
	}
	@Test(priority=4, dataProvider="branch", enabled=true)
	public void createNewBranch(String bname, String add, String zip, String country, String state, String city)
	{
		clickbranches();
		createBranch(bname,add,zip,country,state,city);
	}
	
	@Test(priority=5)
	public void verify_logout()
	{
		logout_Application();
	}
	
}
