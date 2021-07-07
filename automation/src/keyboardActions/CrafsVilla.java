package keyboardActions;
//abstract window toolkit
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CrafsVilla {
	public static void main(String[] args) throws InterruptedException, AWTException {

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");//we avoid IllegalStateException we set the path of driver executable file
		WebDriver driver=new ChromeDriver();// launch the chrome browser
//		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);//implicitlywait
		driver.manage().window().maximize();//maximize the browser
		driver.get("https://www.craftsvilla.com");//launch the web application

		Thread.sleep(3000);
		driver.findElement(By.xpath("//form[@class=\"navbar-form navbar-left new search-form\"]//input[@name='q']")).sendKeys("kurta",Keys.ENTER);
		
		Thread.sleep(3000);
		
		WebDriverWait wt = new WebDriverWait(driver, 20);
		
		wt.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[text()='Kurta']")));
		WebElement target = driver.findElement(By.xpath("//h1[text()='Kurta']"));
		

		
		Actions act = new Actions(driver);
		Robot robot = new Robot();

		act.doubleClick(target).perform();

		Thread.sleep(4000);
		//        
		//    
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_C);
		robot.keyRelease(KeyEvent.VK_C);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(3000);

		driver.findElement(By.xpath("//form[@class=\"navbar-form navbar-left new search-form\"]//input[@name='q']")).click();
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		//        
		//        















	}



}
