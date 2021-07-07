package takessrenshotOfWebpage;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.google.common.io.Files;

public class Way2 {
	
	
	//2
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");//we avoid IllegalStateException we set the path of driver executable file
		RemoteWebDriver driver=new ChromeDriver();// launch the chrome browser\
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com");
		
		File src = driver.getScreenshotAs(OutputType.FILE);
		File dest = new File("./screenshots/firstscreenshot2.png");
		Files.copy(src, dest);
		
		

	}

}
