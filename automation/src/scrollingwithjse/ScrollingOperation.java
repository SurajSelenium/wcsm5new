package scrollingwithjse;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingOperation {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");//we avoid IllegalStateException we set the path of driver executable file
		WebDriver driver=new ChromeDriver();// launch the chrome browser\
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.ajio.com/");
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,4500)");// scroll down by 4500 pixel vertically
		Thread.sleep(3000);
		jse.executeScript("window.scrollBy(0,-4500)");//scroll up by 4500 pixel vertically
		Thread.sleep(3000);
		//scoll to the right side by 20 pixel

		jse.executeScript("window.scrollBy(10,0)");
		Thread.sleep(4000);
		//scoll to the left side by 20 pixel
		jse.executeScript("window.scrollBy(-10,0)");



	}


}
