package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginScript {
	
	
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://desktop.pingone.com/alight");
	Thread.sleep(7000);
	driver.findElement(By.id("username")).sendKeys("suraj");
	Thread.sleep(2000);
	driver.findElement(By.id("password")).sendKeys("sawant");
	Thread.sleep(6000);
	
	WebElement signIn = driver.findElement(By.xpath("//a[contains(text(),'Si55n') and @title='Sign On']"));
	
	
	
	
	
	
	}

}
