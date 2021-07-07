package javascriptexecutor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleDisabled {


	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");//we avoid IllegalStateException we set the path of driver executable file
		WebDriver driver=new ChromeDriver();// launch the chrome browser\
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/HP/Desktop/wcsm5HtmlDocs/DisabledElement.html");
		
		WebElement username = driver.findElement(By.id("i1"));
		WebElement pwd = driver.findElement(By.id("i2"));
		
		if(username.isEnabled())
		{
			username.sendKeys("suraj");
		}
		
		else
		{
			JavascriptExecutor jse=(JavascriptExecutor)driver;
			jse.executeScript("document.getElementById('i1').value='sawant'");
		}
		
		
		if(pwd.isEnabled())
		{
			pwd.sendKeys("sawant");
		}
		
		else
		{
			JavascriptExecutor jse=(JavascriptExecutor)driver;
			jse.executeScript("document.getElementById('i2').value='sawant'");
		}
		
		



	}
}
