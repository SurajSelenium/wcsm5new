package keywordDrivenFramework;

import java.io.IOException;

import org.openqa.selenium.By;

public class ActiTimeLogin extends BaseTest{
	
	
	public static void main(String[] args) throws IOException, InterruptedException {
		
		BaseTest bt = new BaseTest();
		bt.openBrowser();
		
		Thread.sleep(3000);
		
		Flib flib = new Flib();
		
		
		driver.findElement(By.name("username")).sendKeys(flib.readProperyFile("./data/config.properties","un"));//from line 21
		driver.findElement(By.name("pwd")).sendKeys(flib.readProperyFile("./data/config.properties","pwd"));//from line 22
		Thread.sleep(3000);
		driver.findElement(By.id("loginButton")).click();
		
		bt.closeBrowser();
		
		
		
	}

}
