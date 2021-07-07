package pageObjectModel;

import java.io.IOException;

public class TestHomePage extends BaseTest{
	
	
	public static void main(String[] args) throws IOException, InterruptedException {
		
		BaseTest bt = new BaseTest();
		Flib flib = new Flib();
		bt.openBrowser();
		
		LoginPage lp = new LoginPage(driver);
		Thread.sleep(2000);
		lp.validLogin(flib.readPropertyData("./data/config.properties", "un"), flib.readPropertyData("./data/config.properties", "pwd"), driver);
		
		
		HomePage hp = new HomePage(driver);
		hp.clickOnSetting();
		
		
	}

}
