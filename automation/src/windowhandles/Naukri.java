package windowhandles;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Naukri {
	
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");//we avoid IllegalStateException we set the path of driver executable file
		WebDriver driver=new ChromeDriver();// launch the chrome browser
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);//implicitlywait
		driver.manage().window().maximize();//maximize the browser
		driver.get("https://www.naukri.com");//launch the web application
		Thread.sleep(3000);
		
		String parentwindowhandle = driver.getWindowHandle();
		Set<String> allHandles = driver.getWindowHandles();
		
		System.out.println("This is the parent window handle : "+parentwindowhandle);
		
		for(String we:allHandles)
		{
			System.out.println(we);
		}
	}

}
