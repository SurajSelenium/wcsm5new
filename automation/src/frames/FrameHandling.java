package frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FrameHandling {
	
	
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");//we avoid IllegalStateException we set the path of driver executable file
		WebDriver driver=new FirefoxDriver();// launch the chrome browser
//		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);//implicitlywait
		driver.manage().window().maximize();//maximize the browser
		driver.get("file:///C:/Users/HP/Desktop/wcsm5HtmlDocs/username.html");//launch the web application
		
		driver.findElement(By.id("un")).sendKeys("admin");
		driver.findElement(By.id("pwd")).sendKeys("manager");
		
		
		
	}

}
