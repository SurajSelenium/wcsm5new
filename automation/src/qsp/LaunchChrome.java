package qsp;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChrome {
	
	static
	{   //this is used avoid the IllegalStatemException
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		
		
		ChromeDriver driver=new ChromeDriver();//open the browser
		driver.get("file:///C:/Users/HP/Desktop/wcsm5HtmlDocs/checkboxes.html");//it is used to launch the web app by url
		driver.manage().window().maximize();
		Thread.sleep(7000);
		
		driver.close();//close the browser
	}
}


