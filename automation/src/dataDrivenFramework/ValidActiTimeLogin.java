package dataDrivenFramework;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ValidActiTimeLogin {
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");//we avoid IllegalStateException we set the path of driver executable file
		WebDriver driver=new ChromeDriver();// launch the chrome browser
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);//implicitlywait
		driver.manage().window().maximize();//maximize the browser
		driver.get("http://laptop-smc8hiai/login.do");//launch the web application

		Flib flib = new Flib();
		String username = flib.readExcel("./data/Testdata.xlsx","ValidCredentials", 1, 0);
		String password = flib.readExcel("./data/Testdata.xlsx","ValidCredentials", 1, 1);
		
	
		driver.findElement(By.name("username")).sendKeys(username);//from line 21
		driver.findElement(By.name("pwd")).sendKeys(password);//from line 22
		driver.findElement(By.id("loginButton")).click();
		
		WebDriverWait wb = new WebDriverWait(driver,30);
		wb.until(ExpectedConditions.titleContains("Enter"));
		
		flib.writeExcel("./data/Testdata.xlsx","ValidCredentials", 1, 2,"Pass");
		
		
		
		
	}

}
