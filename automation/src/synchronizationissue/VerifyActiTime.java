package synchronizationissue;

import java.util.concurrent.TimeUnit;
//https://opensource-demo.orangehrmlive.com/
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyActiTime {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://laptop-smc8hiai/login.do");
		
		String actualLoginTitle = driver.getTitle();// get the actual login page title
		if(actualLoginTitle.equals("actiTIME - Login"))
		{
			System.out.println("THE LOGIN PAGE TITLE IS VERIFIED ----> THE TEST CASE IS PASSED");
		}
		
		else
		{
			System.out.println("THE LOGIN PAGE TITLE IS NOT VERIFIED ----> THE TEST CASE IS FAILED");
		}
		//send the credentials and click on login
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		
		//here the home page is expected to be loaded and dsipaleyd
		
		String homePageactualTitle = driver.getTitle();//get the actual home page title
		System.out.println(homePageactualTitle+" suraj");
		
		if(homePageactualTitle.equals("actiTIME - Enter Time-Track"))
		{
			System.out.println("THE HOME PAGE TITLE IS VERIFIED ----> THE TEST CASE IS PASSED");
		}
		
		else
		{
			System.out.println("THE HOME PAGE TITLE IS NOT VERIFIED ----> THE TEST CASE IS FAILED");
		}
		
		
	}

}
