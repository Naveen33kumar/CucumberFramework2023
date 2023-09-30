package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddNewCustomerPage {

	WebDriver driver;
	
	public AddNewCustomerPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[contains(text(),'New Customer')]")
	private WebElement addNewCustomerLink;
	
	@FindBy(name = "name")
	private WebElement customerNameField;
	
	@FindBy(name = "addr")
	private WebElement addressField;
	
	@FindBy(name = "city")
	private WebElement cityField;
	
	@FindBy(name = "state")
	private WebElement stateField;
	
	@FindBy(name = "pinno")
	private WebElement pinField;
	
	@FindBy(name = "telephoneno")
	private WebElement telephoneField;
	
	@FindBy(name = "emailid")
	private WebElement emailidField;

	@FindBy(name = "password")
	private WebElement PasswordField;
	
	@FindBy(xpath = "//input[@value='Submit']")
	private WebElement submitBtn;
	
	public void clickNewCustomerLink()
	{
		addNewCustomerLink.click();
	}
	
	public void setNewCustomerName(String customerName)
	{
		customerNameField.clear();
		customerNameField.sendKeys(customerName);
	}
	
	public void setAddressField(String customerAddress)
	{
		addressField.clear();
		addressField.sendKeys(customerAddress);
	}
	
	public void setCity(String city)
	{
		cityField.clear();
		cityField.sendKeys(city);
	}
	
	public void setState(String state)
	{
		stateField.clear();
		stateField.sendKeys(state);
	}
	
	public void setPin(String pin)
	{
		pinField.clear();
		pinField.sendKeys(pin);
	}
	
	public void setEmail(String email)
	{
		emailidField.clear();
		emailidField.sendKeys(email);
	}
	
	public void setPhone(String phone)
	{
		telephoneField.clear();
		telephoneField.sendKeys(phone);
	}
	
	public void setPassword(String password)
	{
		PasswordField.clear();
		PasswordField.sendKeys(password);
	}
	
	public void clickSubmit()
	{
		submitBtn.click();
	}
}