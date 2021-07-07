package methodsOfWebELement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MethodgetText {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/downloads/");
		WebElement seleniumServerink = driver.findElement(By.partialLinkText("3.141.59"));
	   
		String textOfTheLink = seleniumServerink.getText();
		System.out.println(textOfTheLink);
		
	    
	}

}
