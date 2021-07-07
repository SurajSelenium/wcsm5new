package methodsOfWebELement;



import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MethodgeLocation {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com");
		Thread.sleep(2000);
		WebElement button = driver.findElement(By.xpath("//button[contains(@class,' L3NKy')]"));
		Point loc = button.getLocation();
		int xaxis = loc.getX();
		int yaxis = loc.getY();
		System.out.println("x axis distance is : "+xaxis);
		System.out.println("y axis distance is : "+yaxis);
		
		
	}

}
