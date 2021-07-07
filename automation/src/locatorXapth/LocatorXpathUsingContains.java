package locatorXapth;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LocatorXpathUsingContains {
	
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://qspiders.com/");
		Thread.sleep(2000);
		WebElement placementStatisticsLink = driver.findElement(By.xpath("//a[contains(text(),'STATIS')]"));
		placementStatisticsLink.click();
		
	}

}
