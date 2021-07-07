package methodsofwebdriver;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import net.bytebuddy.asm.Advice.Enter;

public class NavigateMethod {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.google.com");// to navigate to the given web app.
		driver.switchTo().activeElement().sendKeys("java",Keys.ENTER);
		Thread.sleep(4000);
		driver.navigate().back();// go to the previous webpage
		Thread.sleep(4000);
		driver.navigate().forward();//go to the next webpage
		Thread.sleep(4000);
		driver.navigate().refresh();//refresh the browser
		
		
	}

}
