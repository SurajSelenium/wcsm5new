package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
//pageclass
public class LoginPage {

	//declaration
	@FindBy(xpath="//input[@name='username']") private WebElement usn;
	@FindBy(name="pwd") private WebElement pwd;
	@FindBy(id="loginButton") private WebElement loginBtn;
	@FindBy(id="keepLoggedInCheckBox") private WebElement checkBox;
	
	
	//initialization
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	

	
	//Utilization
	public WebElement getUsn() {
		return usn;
	}

	public WebElement getPwd() {
		return pwd;
	}
	public WebElement getLoginBtn() {
		return loginBtn;
	}
	public WebElement getCheckBox() {
		return checkBox;
	}
	
	
	
	// generic reusable method to login 
	
	public  void validLogin(String username,String password,WebDriver driver)
	{
		usn.sendKeys(username);
		pwd.sendKeys(password);
		driver.navigate().refresh();
		loginBtn.click();
	

	}
	
	
	
	
	
}
