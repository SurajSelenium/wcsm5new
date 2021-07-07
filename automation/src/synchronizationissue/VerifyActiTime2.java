package synchronizationissue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class VerifyActiTime2 {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://laptop-smc8hiai/login.do");
		
		String actualLoginTitle = driver.getTitle();
		if(actualLoginTitle.equals("actiTIME - Login"))
		{
			System.out.println("THE LOGIN PAGE TITLE IS VERIFIED ----> THE TEST CASE IS PASSED");
		}
		
		else
		{
			System.out.println("THE LOGIN PAGE TITLE IS NOT VERIFIED ----> THE TEST CASE IS FAILED");
		}
		
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		
		String homePageactualTitle = driver.getTitle();
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
