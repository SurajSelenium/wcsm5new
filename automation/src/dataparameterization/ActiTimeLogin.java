package dataparameterization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ActiTimeLogin {

	WebDriver driver;
	@Parameters({"username","password","browser"})
	@Test
	public void loginActiTime(String usn,String psw,String browservalue)
	{
		if(browservalue.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			driver.get("http://laptop-smc8hiai/login.do");
			driver.findElement(By.name("username")).sendKeys(usn);
			driver.findElement(By.name("pwd")).sendKeys(psw);
			driver.findElement(By.id("loginButton")).click();
		}

		else if(browservalue.equalsIgnoreCase("firefox"))
		{

			System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
			driver=new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			driver.get("http://laptop-smc8hiai/login.do");
			driver.findElement(By.name("username")).sendKeys(usn);
			driver.findElement(By.name("pwd")).sendKeys(psw);
			driver.findElement(By.id("loginButton")).click();

		}


		else 
		{
            Reporter.log("invalid choice",true);
		}


	}

}
