package flipkart;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart2 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	Scanner sc = new Scanner(System.in);
	System.out.println("Please Enter the option which you want to select");
	String optionToClickOn = sc.nextLine();
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com/");
	Thread.sleep(7000);
	driver.findElement(By.xpath("//button[text()='✕']")).click();
	driver.findElement(By.name("q")).sendKeys("Laptop");
	Thread.sleep(5000);
	driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath("//span[@class='_2I9KP_' and .='"+optionToClickOn+"']")).click();

	
	
	
}
}
