package combinedatadrivenandkeyword;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTimeValidLogin  extends BaseTest{

	public static void main(String[] args) throws IOException, InterruptedException {

		BaseTest bt = new BaseTest();
		bt.setUp();

		Flib flib = new Flib();
		String username = flib.readPropertyData(PROP_PATH, "un");

		driver.findElement(By.name("username")).sendKeys(username);
		Thread.sleep(1000);

		String password = flib.readPropertyData(PROP_PATH, "pwd");

		driver.findElement(By.name("pwd")).sendKeys(password);
		Thread.sleep(1000);

		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(2000);
		
		bt.tearDown();


	}

}
