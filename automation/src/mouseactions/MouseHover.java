package mouseactions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");//we avoid IllegalStateException we set the path of driver executable file
		WebDriver driver=new ChromeDriver();// launch the chrome browser\
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.urbanladder.com/");
		
		List<WebElement> ops = driver.findElements(By.xpath("//span[@class='topnav_itemname']"));
		int k = ops.size();
		for(int i=1;i<=k;i++)
		{
			Actions act = new Actions(driver);
			act.moveToElement(ops.get(i)).perform();
			Thread.sleep(1000);
		}
		
	}

}
