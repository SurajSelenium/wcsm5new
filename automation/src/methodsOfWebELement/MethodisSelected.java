package methodsOfWebELement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MethodisSelected {


	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/HP/Desktop/wcsm5HtmlDocs/checkboxes.html");
		Thread.sleep(2000);
		WebElement marathi = driver.findElement(By.id("i1"));
		boolean statusOfMarathi = marathi.isSelected();
		System.out.println(statusOfMarathi);//false
		marathi.click();
		boolean statusOfMarathi2 = marathi.isSelected();
		System.out.println(statusOfMarathi2);//true
		
		
	}

}
