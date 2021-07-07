package combinedatadrivenandkeyword;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTimeInvalidLogin extends BaseTest{
	
	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		BaseTest bt = new BaseTest();
		bt.setUp();
		
		Flib flib = new Flib();
		int rc = flib.getRowCount(EXCEL_PATH,"InvalidCredentials");
		for(int i=1;i<=rc;i++)
		{
			String username = flib.readExcel(EXCEL_PATH,"InvalidCredentials", i,0);
			WebElement username1 = driver.findElement(By.name("username"));
			username1.clear();
			username1.sendKeys(username);
			String password = flib.readExcel(EXCEL_PATH,"InvalidCredentials", i,1);
			driver.findElement(By.name("pwd")).sendKeys(password);
			Thread.sleep(2000);
			driver.findElement(By.id("loginButton")).click();
			Thread.sleep(2000);
			
			
		}
		bt.tearDown();
	}
}
