package methodsofwebdriver;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCurrentURLMethod {
	
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		String currentUrl = driver.getCurrentUrl();//this method is used to get the current url of the webpage
		System.out.println(currentUrl);
		
	}

}
