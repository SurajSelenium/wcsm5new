package flipkart;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("bike");
		Thread.sleep(6000);
		List<WebElement> sugg = driver.findElements(By.xpath("//div[@class='wM6W7d']/span"));
     
     
		for(int b=0;b<sugg.size();b++)
		{
			String ops = sugg.get(b).getText();
			System.out.println(ops);
			Thread.sleep(2000);

		}
		
//		for(WebElement we : sugg)
//		{
//			String data = we.getText();
//			System.out.println(data);
//			Thread.sleep(2000);
//		}
		
		
		



	}




}
