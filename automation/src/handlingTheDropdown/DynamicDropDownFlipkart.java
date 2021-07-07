package handlingTheDropdown;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDropDownFlipkart {
	//get the suggestions when we type laptop in sarch box
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");//we avoid IllegalStateException we set the path of driver executable file
		WebDriver driver=new ChromeDriver();// launch the chrome browser
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);//implicitlywait
		driver.manage().window().maximize();//maximize the browser
		driver.get("https://www.flipkart.com");//launch the web application
		driver.findElement(By.xpath("//button[.='✕']")).click();//close the hidden division popup
		Thread.sleep(3000);
		
		
		driver.findElement(By.name("q")).sendKeys("laptop");// send the text mobile to searchbox
		Thread.sleep(6000);
		
		List<WebElement> suggestions = driver.findElements(By.xpath("//div[@class='lrtEPN _17d0yO']"));
		
		for(WebElement we : suggestions)
		{
			String laptopsugg = we.getText();
			System.out.println(laptopsugg);
		}
		
		
	}

}
