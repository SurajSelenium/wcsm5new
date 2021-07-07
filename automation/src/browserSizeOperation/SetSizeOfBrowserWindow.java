package browserSizeOperation;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetSizeOfBrowserWindow {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		/*
		 * set the size of the browser window 100 is the width and 800 is height
		 */
		Dimension dimensions = new Dimension(100, 800);
		driver.manage().window().setSize(dimensions);
	}

}
