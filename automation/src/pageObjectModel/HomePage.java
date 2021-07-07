package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	//declaration
	@FindBy(xpath="//div[text()='Settings']") private WebElement settings;
	@FindBy(xpath="//div[text()='Users']") private WebElement users;
	
	
	
	
	//initilization
	
	
	public HomePage(WebDriver driver) {
	PageFactory.initElements(driver, this);	
	}
	
	
	
	
	
	//utilization
	public WebElement getSettings() {
		return settings;
	}

	public WebElement getUsers() {
		return users;
	}

	
	public void  clickOnSetting()
	{
		settings.click();
	}
	
	public void clickOnUsers()
	{
		users.click();
	}
	
	
	
	
}
