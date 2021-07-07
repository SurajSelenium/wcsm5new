package pageObjectModel;

import java.io.IOException;

public class ValidLoginActiTime extends BaseTest {
	
	
	public static void main(String[] args) throws IOException, InterruptedException {
		
		BaseTest bt = new BaseTest();
		bt.openBrowser();
		
		LoginPage lp = new LoginPage(driver);
		
		Flib flib = new Flib();
		Thread.sleep(2000);
		lp.validLogin(flib.readPropertyData("./data/config.properties", "un"), flib.readPropertyData("./data/config.properties", "pwd"), driver);
		
		
		
		
		
		
	}

}
