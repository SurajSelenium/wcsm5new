package testNGAnnotationUsedForApp;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class NewTest {
  WebDriver driver;
	
  @Test
  public void loginActiTime()
  
  {
	  driver.findElement(By.name("username")).sendKeys("admin");
	  driver.findElement(By.name("pwd")).sendKeys("manager");
	  driver.findElement(By.id("loginButton")).click();
	  
  }
  
  
  @Test
  public void loginActiTimeInvalid()
  
  {
	  driver.findElement(By.name("username")).sendKeys("admin");
	  driver.findElement(By.name("pwd")).sendKeys("admin");
	  driver.findElement(By.id("loginButton")).click();
	  
  }
  
  @BeforeMethod
  public void setup() throws InterruptedException {
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	  driver.get("http://laptop-smc8hiai/login.do");
	  Thread.sleep(3000);
  }

  @AfterMethod
  public void afterMethod()
  
  {
	  driver.quit();
  
  }

  @BeforeTest
  public void configureTheBrowser() {
	  System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
  }

  @AfterTest
  public void reportGeneration() 
  {
	  Reporter.log("the reports are generated",true);
  }

}
