package windowhandles;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PeformMaximizeOperationOnPerticularChildWindow {
	
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");//we avoid IllegalStateException we set the path of driver executable file
		WebDriver driver=new ChromeDriver();// launch the chrome browser
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);//implicitlywait
		driver.manage().window().maximize();//maximize the browser
		driver.get("https://www.naukri.com");//launch the web application
		Thread.sleep(3000);
		String parentwindowhandle = driver.getWindowHandle();
		Set<String> allHandles = driver.getWindowHandles();
		//performing maximize operation on perticular child window.
		System.out.println("This is the parent window handle : "+parentwindowhandle);
		
		System.out.println("The total number  of windows open are : "+allHandles.size());
		
		for(String wh:allHandles)
		{
			String title = driver.switchTo().window(wh).getTitle();
			System.out.println(title);
			if(title.equals("Genpact"))
			{
				driver.manage().window().maximize();
				Thread.sleep(2000);
				driver.close();
				break;
				
			}
		}
	
		
	}

}
