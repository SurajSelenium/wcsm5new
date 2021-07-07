package takessrenshotOfWebpage;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.google.common.io.Files;

public class ScreenshotOfWebElement {
	
	
	//screenshot using explicit Type casting
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");//we avoid IllegalStateException we set the path of driver executable file
		WebDriver driver=new ChromeDriver();// launch the chrome browser\
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		
		WebElement target = driver.findElement(By.name("q"));
		File src = target.getScreenshotAs(OutputType.FILE);
		File dest = new File("./screenshots/googlesearchbox.png");
		Files.copy(src,dest);
		
		
		

	}

}
