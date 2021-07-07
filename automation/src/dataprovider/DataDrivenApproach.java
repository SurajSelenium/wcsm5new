package dataprovider;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataDrivenApproach {
	WebDriver driver;
	@BeforeTest
	public void setProp()
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	}

	@BeforeMethod
	public void setUp()
	{

		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("http://laptop-smc8hiai/login.do");

	}

	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	
	@DataProvider(name="TestData")
	public Object[][] testData()
	{
		Object[][] data = new Object[3][2];

		data[0][0]="admin123";
		data[0][1]="manager123";

		data[1][0]="admin";
		data[1][1]="VGBJKJ";

		data[2][0]="$#$$^&*GVJ";
		data[2][1]="manager";

		return data;
	}
	
	@Test(dataProvider = "TestData")
	public void testInvalidActitime(String username,String password) throws InterruptedException
	{

		driver.findElement(By.name("username")).sendKeys(username);
		Thread.sleep(2000);
		driver.findElement(By.name("pwd")).sendKeys(password);
		Thread.sleep(2000);
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(2000);


	}





















}
