package javascriptexecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleDisabledElement {

	
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");//we avoid IllegalStateException we set the path of driver executable file
	WebDriver driver=new ChromeDriver();// launch the chrome browser\
	driver.manage().window().maximize();
	driver.get("file:///C:/Users/HP/Desktop/wcsm5HtmlDocs/DisabledElement.html");
	driver.findElement(By.id("i1")).sendKeys("suraj");
	driver.findElement(By.id("i2")).sendKeys("sawant");//org.openqa.selenium.ElementNotInteractableException: element not interactable
	  
	}
}
