package flipkart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart1 {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(7000);
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		driver.findElement(By.name("q")).sendKeys("Laptop");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='_3879cV' and .='Core i5']/preceding-sibling::div")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='_3879cV' and .='HP']/preceding-sibling::div")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='_2gmUFU _3V8rao' and .='Operating System']")).click();
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='_3879cV' and .='Windows 10']/preceding-sibling::div")).click();
		Thread.sleep(4000);
		String priceOfTheFirstSuggestion = driver.findElement(By.xpath("(//div[@class='_4rR01T']/ancestor::div[@class='_3pLy-c row']/descendant::div[@class='_25b18c']/div[@class='_30jeq3 _1_WHN1'])[1]")).getText();
		System.out.println("The price of first suggestion : "+priceOfTheFirstSuggestion);
		
	}

}
