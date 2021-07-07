package methodsofwebdriver;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowHandles {
	
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com");
		
		String parentHandle = driver.getWindowHandle();//only parent handle
		System.out.println("parent Handle"+parentHandle);
		Set<String> handles = driver.getWindowHandles();// all the handle of all windows including child window
		
		for(String se :handles)
		{
			System.out.println(se);
		}
		
	}

}
