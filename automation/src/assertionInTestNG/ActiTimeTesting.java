package assertionInTestNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class ActiTimeTesting {
	
	@Test
	public void testActiTime()
	{
		SoftAssert softassert = new SoftAssert();
		
		Reporter.log("launch the browser",true);
		Reporter.log("Open the web application",true);
		Reporter.log("Verify the login page title ",true);
		softassert.assertEquals(false, true);//softassert
	    
		
		Reporter.log("If user name text box is enabled then send username",true);
		Assert.assertEquals(true, true);
		Reporter.log("If password  text box is enabled then send password",true);
		Assert.assertEquals(true, true);
		Reporter.log("click on login button if it is enabled",true);
		Assert.assertEquals(true, true);
		
		Reporter.log("Verify the home page title",true);
		
		softassert.assertEquals(false, true);//softassert
		
		
		
		Reporter.log("Create the new user",true);
		Reporter.log("Configure the settings",true);
		
		Reporter.log("Logout",true);
		
		
		softassert.assertAll();
		
		
		
		
		
	}
	
	
	
	

}
