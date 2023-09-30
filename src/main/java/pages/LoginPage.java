package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver driver;
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name = "uid")
	private WebElement userIdField;	
	
	@FindBy(name = "password")
	private WebElement passswordField;
	
	@FindBy(name = "btnLogin")
	private WebElement loginButton;	
	
	public void setUid(String username)
	{
		userIdField.sendKeys(username);
	}	
	
	public void setPassword(String password)
	{
		passswordField.sendKeys(password);
	}
	
	public HomePage clickLoginButton()
	{
		loginButton.click();
		return new HomePage(driver);
	}
	
	
}