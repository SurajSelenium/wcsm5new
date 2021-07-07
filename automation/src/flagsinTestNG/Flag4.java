package flagsinTestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag4 {
	
	@Test(description = "Hi this method is used to login to the application")
	public void login()
	{
	Reporter.log("Login to the application",true);	
	}
	
	
	@Test(description = "Hi this method is used to logout to the application")
	public void logout()
	{
		Reporter.log("Logout from  the application",true);	
	}

}
