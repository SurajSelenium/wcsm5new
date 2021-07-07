package webbasedpopups;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeysP {

	public static void main(String[] args) throws InterruptedException, AWTException {

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");//we avoid IllegalStateException we set the path of driver executable file
		WebDriver driver=new ChromeDriver();// launch the chrome browser\
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.tutorialsteacher.com/codeeditor?cid=js-3");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[.='I am Hungry']")).click();
		Thread.sleep(3000);


		Alert al = driver.switchTo().alert();
		Robot rt = new Robot();
		rt.keyPress(KeyEvent.VK_BACK_SPACE);
		rt.keyRelease(KeyEvent.VK_BACK_SPACE);
		Thread.sleep(3000);
		
		al.sendKeys("67");

		al.accept();// this is used to Dismiss  the popup(cancel button)


	}

}
