package combinedatadrivenandkeyword;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest implements IAutoConstant {
	
	static WebDriver driver;
	
	
	
	public void setUp() throws IOException
	{
		Flib flib = new Flib();
		String baseurl = flib.readPropertyData(PROP_PATH,"url");
		String browserValue = flib.readPropertyData(PROP_PATH,"browser");
		
		
		if(browserValue.equalsIgnoreCase("chrome"))
		{
			System.setProperty(CHROME_KEY,CHROME_PATH);
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(ITO, TimeUnit.SECONDS);
			driver.get(baseurl);
			
			
		
		}
		
		else if(browserValue.equalsIgnoreCase("firefox"))
		{
			System.setProperty(GECKO_KEY,GECKO_PATH);
			driver=new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(ITO, TimeUnit.SECONDS);
			driver.get(baseurl);
		}
		
		else
		{
			System.out.println("Invalid input");
		}
		
	}
	
	
	
	
	public void tearDown()
	{
		driver.close();
	}

}
