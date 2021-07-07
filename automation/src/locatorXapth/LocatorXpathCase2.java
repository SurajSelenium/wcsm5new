package locatorXapth;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorXpathCase2 {
	//xpath using text function
	public static void main(String[] args) throws InterruptedException {System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.craftsvilla.com/");
	Thread.sleep(5000);
	driver.findElement(By.xpath("//span[text()='Sign In']")).click();
		
	}

}
