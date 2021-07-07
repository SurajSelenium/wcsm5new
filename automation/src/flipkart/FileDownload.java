package flipkart;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FileDownload {
	//abstract window toolkit
	public static void main(String[] args) throws AWTException, InterruptedException, IOException {
		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/downloads");
		driver.findElement(By.partialLinkText("3.141.59")).click();
		Thread.sleep(4000);
		
		File ff = new File("./data/download.exe");
		String absolutePath = ff.getAbsolutePath();
		
		Runtime.getRuntime().exec(absolutePath);
		
	
	}

}
