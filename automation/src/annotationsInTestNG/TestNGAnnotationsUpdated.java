package annotationsInTestNG;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGAnnotationsUpdated {
	
	@Test
	public void createUser()
	{
		Reporter.log("The User is created",true);
	}
	
	
	@BeforeMethod
	public void openBrowser()
	{
		Reporter.log("Open the Browser",true);
	}
	
	
	@AfterMethod
	public void closeBrowser()
	{
		Reporter.log("Close the Browser",true);
	}
	
	
	@Test
	public void addEmployee()
	{
		Reporter.log("Add the Employee",true);
	}
	
	
}
