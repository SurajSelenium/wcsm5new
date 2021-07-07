package locatorXapth;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathUsingContains2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://instagram.com/");
		
		WebElement username = driver.findElement(By.name("username"));
		username.sendKeys("suraj@123.com");
	    
		
		
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("wxyz123");
		
		Thread.sleep(2000);
		//xpath using contains (for attribute and attribute value)
		WebElement button = driver.findElement(By.xpath("//div[contains(@class,'DhRcB')]"));
	    button.click();
		
		
		
				
		
	}
}
