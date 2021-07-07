package pageObjectModel1;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import combinedatadrivenandkeyword.Flib;

public class TestActiTimeInvalid extends BaseTest {
	
	public static void main(String[] args) throws IOException, InterruptedException {
		BaseTest bt = new BaseTest();
		bt.openBrowser();
		LoginPage lp = new LoginPage(driver);
		
		Flib flib = new Flib();
		int rc = flib.getRowCount(EXCEL_PATH,"InvalidCredentials");
		for(int i=1;i<=rc;i++)
		{
			lp.clearUsername();
			String username = flib.readExcel(EXCEL_PATH,"InvalidCredentials", i,0);
			String password = flib.readExcel(EXCEL_PATH,"InvalidCredentials", i,1);
			Thread.sleep(2000);
			
			lp.invalidLoginMethod(username, password);
			
			
			
			
			
		}
		
		
	}

}
