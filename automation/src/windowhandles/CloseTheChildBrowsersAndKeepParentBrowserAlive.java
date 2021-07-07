package windowhandles;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseTheChildBrowsersAndKeepParentBrowserAlive {
	//closing the child windows and keeping the Parent window alive.
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");//we avoid IllegalStateException we set the path of driver executable file
		WebDriver driver=new ChromeDriver();// launch the chrome browser
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);//implicitlywait
		driver.manage().window().maximize();//maximize the browser
		driver.get("https://www.naukri.com");//launch the web application
		Thread.sleep(3000);
		String parentwindowhandle = driver.getWindowHandle();
		String parentTitle = driver.getTitle();
		Set<String> allHandles = driver.getWindowHandles();
		
		for(String wh:allHandles)
		{
			String title = driver.switchTo().window(wh).getTitle();
			if(!title.equals(parentTitle))
			{
				driver.close();
			}
		}
	}

}
