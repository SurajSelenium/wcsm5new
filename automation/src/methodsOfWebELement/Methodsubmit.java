package methodsOfWebELement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Methodsubmit {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://instagram.com/");
		Thread.sleep(6000);
		WebElement username = driver.findElement(By.name("username"));
		username.sendKeys("suraj@123.com");
	
		
		Thread.sleep(2000);
		
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("wxyz123");
		
		Thread.sleep(3000);
		//xpath using contains (for attribute and attribute value)
		WebElement button = driver.findElement(By.xpath("//div[contains(@class,'DhRcB')]"));
		button.submit();
		
		
		
				
		
	}
}
