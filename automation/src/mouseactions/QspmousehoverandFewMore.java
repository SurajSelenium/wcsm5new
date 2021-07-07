package mouseactions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class QspmousehoverandFewMore {

	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");//we avoid IllegalStateException we set the path of driver executable file
		WebDriver driver=new ChromeDriver();// launch the chrome browser\
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.bluestone.com/");
		Thread.sleep(9000);
		Robot rt = new Robot();
		rt.keyPress(KeyEvent.VK_ENTER);
		rt.keyRelease(KeyEvent.VK_ENTER);

		List<WebElement> ops = driver.findElements(By.xpath("//span[@class='topnav_itemname']"));
		int k = ops.size();
		for(int i=1;i<k;i++)
		{
			Actions act = new Actions(driver);
			act.moveToElement(ops.get(i)).perform();
			Thread.sleep(2000);
			List<WebElement> linkops = driver.findElements(By.xpath("//a[@class='inverted' and @rel='nofollow']/span"));
			for(WebElement we :linkops)
			{
              String linktext = we.getText();
              System.out.println(linktext);
			}
		}

	}

}
