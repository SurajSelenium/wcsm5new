package flipkart;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FlipkartNew {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");//to avoid IllegalStateException
		WebDriver driver=new ChromeDriver();//launch the chrome browser
		driver.manage().window().maximize();//maximize the browser
		driver.get("https://www.flipkart.com");//launch the web app
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);//implicitlyWait
		
		driver.findElement(By.xpath("//button[.='✕']")).click();//close this login popup
		driver.findElement(By.name("q")).sendKeys("Mobile");//enter the text in the searchbox
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click(); //search icon click
		
		//performing mousehover on the following webElement
		WebElement electronics = driver.findElement(By.xpath("//span[.='Electronics']"));
		
		Actions act = new Actions(driver);
		act.moveToElement(electronics).perform();// moveToElement is used to mousehover on that element
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='_1fwVde']/a[.='Samsung']")).click();// samsung brand link is selected
		
		driver.findElement(By.xpath("//div[@class='CXW8mj']/img[@alt='SAMSUNG Galaxy M12 (Blue, 128 GB)']")).click();// actaul phone is selected
		Thread.sleep(7000);
		
		//Control goes to new tab so we need to use getWindowHandles
		//select black filter
		String parentHandle = driver.getWindowHandle();// taking it for future use
		Set<String> handles = driver.getWindowHandles();// all the handles we are getting
		
		for(String se: handles)
		{
			if(!se.equals(parentHandle))// eliminate parent handle
			driver.switchTo().window(se);
		}
		
		
		//select color
				driver.findElement(By.xpath("(//div[@class='_2C41yO'])[3]")).click();
				Thread.sleep(2000);
				//select the storage
				driver.findElement(By.xpath("//a[.='64 GB']")).click();
				
				//add to cart button
				driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")).click();
				
				//click on remove icon
				driver.findElement(By.xpath("//div[.='Remove']")).click();
				
				
				//click on remove button
				driver.findElement(By.xpath("//div[@class='td-FUv WDiNrH']/div[2]")).click();
	}

}
