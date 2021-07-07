package runTimePolyMorphism;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class LaunchBrowser {
	 static WebDriver driver;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);// for user inputs
		System.out.println("Please Enter the Browser name");
		String browserValue = sc.next();// takes the user input
		System.out.println(browserValue);
		
		if(browserValue.equalsIgnoreCase("chrome"))
		{   System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");//to avoid the IllegalStateException
			driver=new ChromeDriver();//launch the Chrome Browser
			driver.manage().window().maximize();// Maximize the Browser Window
			driver.get("https://www.instagram.com");//launch the Web App
		}
		
		else if(browserValue.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");//to avoid the IllegalStateException
			driver=new FirefoxDriver();//to launch the Firefox Browser
			driver.manage().window().maximize();//maximize the Browser Window
			driver.get("https://www.instagram.com");//launch the web app
		}
		
		else 
		{
			System.out.println(" Enter the valid browser name");
		}
		
		
		
		
		
		
		
		
		}
	}


