package dataDrivenFramework;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import dataDrivenFramework.Flib;

public class InvalidLoginActittime {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");//we avoid IllegalStateException we set the path of driver executable file
		WebDriver driver=new ChromeDriver();// launch the chrome browser
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);//implicitlywait
		driver.manage().window().maximize();//maximize the browser
		driver.get("http://laptop-smc8hiai/login.do");//launch the web application
		Thread.sleep(5000);

		Flib flib = new Flib();
		int rc = flib.getRowCount("./data/Testdata.xlsx","InvalidCredentials");
		for(int i=1;i<=rc;i++)
		{
			String username = flib.readExcel("./data/Testdata.xlsx","InvalidCredentials", i,0);
			WebElement username1 = driver.findElement(By.name("username"));
			username1.clear();
			username1.sendKeys(username);
			String password = flib.readExcel("./data/Testdata.xlsx","InvalidCredentials", i,1);
			driver.findElement(By.name("pwd")).sendKeys(password);
			Thread.sleep(2000);
			driver.findElement(By.id("loginButton")).click();
			Thread.sleep(2000);
		}
	}
}






