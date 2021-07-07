package scrollingwithjse;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingTillThePerticularWebElement {

	//Scrolling till the perticular WebElement
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");//we avoid IllegalStateException we set the path of driver executable file
		WebDriver driver=new ChromeDriver();// launch the chrome browser\
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.selenium./");
		
		WebElement target = driver.findElement(By.xpath("//img[contains(@src,'onlinestores') and contains(@src,'secti') ]"));
		Point loc = target.getLocation();
		int xaxis = loc.getX();
		int yaxis = loc.getY();
		
		System.out.println("x axis :"+xaxis);
		System.out.println("y axis :"+yaxis);
		
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy("+xaxis+","+(yaxis-92)+")");
		



	}


}
