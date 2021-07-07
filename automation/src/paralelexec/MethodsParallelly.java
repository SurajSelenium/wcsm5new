package paralelexec;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class MethodsParallelly {
	WebDriver driver;
	
	@Test
	public void methodA()
	{
		Reporter.log("Hi , I am method1 "+Thread.currentThread().getId(),true);
	}
	
	
	@Test
	public void methodB()
	{
		Reporter.log("Hi , I am method2 "+Thread.currentThread().getId(),true);
	}

}
