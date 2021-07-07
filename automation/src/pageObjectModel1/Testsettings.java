package pageObjectModel1;

import java.io.IOException;

public class Testsettings extends BaseTest {


	public static void main(String[] args) throws IOException {


		BaseTest bt = new BaseTest();
		Flib flib = new Flib();
		bt.openBrowser();

		LoginPage lp = new LoginPage(driver);
		lp.validLogin(flib.readPropertyData(PROP_PATH, "un"), flib.readPropertyData(PROP_PATH, "pwd"));
		
		
		
		HomePage hp = new HomePage(driver);
		hp.clicksettings();
	}

}
