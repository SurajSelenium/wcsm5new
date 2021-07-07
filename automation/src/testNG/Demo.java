package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo {



	@Test
	public void run() 
	{
		
		Reporter.log("Hi I am from method run ",true);
	}
	
	
	
	
}
