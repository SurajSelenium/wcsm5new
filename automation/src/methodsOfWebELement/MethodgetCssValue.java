package methodsOfWebELement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MethodgetCssValue {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		WebElement googlSearch = driver.findElement(By.name("btnK"));
		String cssValue = googlSearch.getCssValue("font-family");
		System.out.println(cssValue);

	}

}
