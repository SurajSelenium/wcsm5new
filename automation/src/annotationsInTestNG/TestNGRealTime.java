package annotationsInTestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class TestNGRealTime {
	
	
	@AfterClass
	public void afterClass() 
	{
		Reporter.log("After Class",true);
	}
	
	@BeforeMethod
	public void beforeMethod()
	{
		Reporter.log("Before Method",true);
	}

	@AfterMethod
	public void afterMethod() 
	{
		Reporter.log("After Method",true);
	}

	@BeforeTest
	public void beforeTest()
	{
		Reporter.log("Here we can set the Syetem.setProperty of the browser",true);
	}

	@AfterTest
	public void afterTest()
	{
		Reporter.log("After Test",true);
	}

	@BeforeSuite
	public void beforeSuite() 
	{
		Reporter.log("This application is used to monitor the employee activities and also known as employee timesheet tool",true);
	}

	@AfterSuite
	public void afterSuite()
	{
		Reporter.log("After Suite",true);
	}
	
	
	@BeforeClass
	public void beforeClass() 
	{
		Reporter.log("Before Class",true);
	}
	
	
	@Test
	public void f()
	{
		Reporter.log("Test Case1",true);
	}
	
	@Test
	public void g()
	{
		Reporter.log("Test Case2",true);
	}
	
	
	
	

}
