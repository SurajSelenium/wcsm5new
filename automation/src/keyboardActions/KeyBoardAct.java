package keyboardActions;
//abstract window toolkit
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class KeyBoardAct {
	public static void main(String[] args) throws InterruptedException, AWTException {
		
		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");//we avoid IllegalStateException we set the path of driver executable file
		WebDriver driver=new FirefoxDriver();// launch the chrome browser
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);//implicitlywait
		driver.manage().window().maximize();//maximize the browser
		driver.get("https://www.selenium.dev/downloads/");//launch the web application
		Thread.sleep(5000);
		driver.findElement(By.partialLinkText("3.141")).click();// download popup generation
		Thread.sleep(5000);
		Robot robot = new Robot();//java.awt.Robot
		
		robot.keyPress(KeyEvent.VK_LEFT);
		robot.keyRelease(KeyEvent.VK_LEFT);
		Thread.sleep(7000);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		
		
		
		
	}
	
	

}
