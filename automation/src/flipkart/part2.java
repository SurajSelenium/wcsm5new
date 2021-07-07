package flipkart;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class part2 {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");//we avoid IllegalStateException we set the path of driver executable file
		WebDriver driver=new ChromeDriver();// launch the chrome browser
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);//implicitlywait
		driver.manage().window().maximize();//maximize the browser
		driver.get("https://www.flipkart.com/samsung-galaxy-m12-black-128-gb/p/itme593a120f429d?pid=MOBGFZUNGH22RJZT&lid=LSTMOBGFZUNGH22RJZTW3CO1X&marketplace=FLIPKART&fm=neo%2Fmerchandising&iid=M_998598d1-85bc-4b03-bc36-ee4446219672_1_1BUWY8OBA8L9_MC.MOBGFZUNGH22RJZT&ppt=sp&ppn=sp&ssid=ol00d5megw0000001621997447195&otracker=clp_pmu_v2_Latest%2BSamsung%2Bmobiles%2B_4_1.productCard.PMU_V2_SAMSUNG%2BGalaxy%2BM12%2B%2528Black%252C%2B128%2BGB%2529_samsung-mobile-store_MOBGFZUNGH22RJZT_neo%2Fmerchandising_3&otracker1=clp_pmu_v2_PINNED_neo%2Fmerchandising_Latest%2BSamsung%2Bmobiles%2B_LIST_productCard_cc_4_NA_view-all&cid=MOBGFZUNGH22RJZT&affid=vignesh30");//launch the web application
	}

}
