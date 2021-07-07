package methodsofwebdriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitleMethod {
	
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://laptop-smc8hiai/login.do");
		String titleOfThePage = driver.getTitle();
		System.out.println(titleOfThePage);
		driver.close();
	}

}
