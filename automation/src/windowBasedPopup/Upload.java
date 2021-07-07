package windowBasedPopup;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.omg.SendingContext.RunTime;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Upload {
	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");//we avoid IllegalStateException we set the path of driver executable file
		WebDriver driver=new ChromeDriver();// launch the chrome browser\
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		driver.findElement(By.xpath("//a[@id='menu_pim_viewPimModule']")).click();
		driver.findElement(By.xpath("//a[.='Add Employee']")).click();
		driver.findElement(By.id("firstName")).sendKeys("user");
		driver.findElement(By.id("lastName")).sendKeys("xyz");
		WebElement target = driver.findElement(By.id("photofile"));
		new Actions(driver).doubleClick(target).perform();
		Thread.sleep(4000);
		//How to integrate the autoIT script with selenium
		File ff = new File("./autoit/uploadFileScript.exe");
		String abspath = ff.getAbsolutePath();
		
		Runtime.getRuntime().exec(abspath);
		
		
	}

}
