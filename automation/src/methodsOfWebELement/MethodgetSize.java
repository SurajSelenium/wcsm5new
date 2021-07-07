package methodsOfWebELement;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MethodgetSize {
	
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com");
		Thread.sleep(2000);
		WebElement button = driver.findElement(By.xpath("//button[contains(@class,' L3NKy')]"));
	
		Dimension d = button.getSize();
		int height = d.getHeight();
		int width = d.getWidth();
		System.out.println(height);
		System.out.println(width);
		
	}

}
