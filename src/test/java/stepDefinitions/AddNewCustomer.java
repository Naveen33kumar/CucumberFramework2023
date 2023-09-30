package stepDefinitions;

import java.io.FileNotFoundException;
import java.util.Map;

import org.openqa.selenium.By;

import factory.DriverFactory;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.AddNewCustomerPage;
import pages.HomePage;
import pages.LoginPage;

public class AddNewCustomer extends DriverFactory{

	LoginPage lp = new LoginPage(driver);
	HomePage hp = new HomePage(driver);
	AddNewCustomerPage newCustomer = new AddNewCustomerPage(driver);
	
	public AddNewCustomer() throws FileNotFoundException {
		super();
	}

	@Given ("User has entered valid user id {string} and password {string}")
	public void enteringUserIdandPassword(String username, String password)
	{
		lp.setUid(username);
		lp.setPassword(password);
		lp.clickLoginButton();
	}
	
	@Then("User clicks on new customer link")
	public void Then_User_clicks_on_new_customer_link()
	{
		newCustomer = hp.clickAddNewCustomerLink();
	}
	
	@And("User enters the customer details into the below field")
	public void And_User_enters_the_customer_details_into_the_below_field(DataTable datatable)
	{
		Map<String, String> dataMap = datatable.asMap(String.class, String.class);
		newCustomer.setNewCustomerName(dataMap.get("Customer name"));
		newCustomer.setAddressField(dataMap.get("Address"));
		newCustomer.setCity(dataMap.get("City"));
		newCustomer.setState(dataMap.get("State"));
		newCustomer.setPin("Pin");
		newCustomer.setPhone(dataMap.get("Mobile Number"));
		newCustomer.setEmail(dataMap.get("E-mail"));
		newCustomer.setPassword(dataMap.get("Password"));
		
		/*
		 * driver.findElement(By.name("name")).sendKeys(dataMap.get("Customer name"));
		 * driver.findElement(By.name("addr")).sendKeys(dataMap.get("Address"));
		 * driver.findElement(By.name("city")).sendKeys(dataMap.get("City"));
		 * driver.findElement(By.name("state")).sendKeys(dataMap.get("State"));
		 * driver.findElement(By.name("pinno")).sendKeys(dataMap.get("Pin"));
		 * driver.findElement(By.name("telephoneno")).sendKeys(dataMap.
		 * get("Mobile Number"));
		 * driver.findElement(By.name("emailid")).sendKeys(dataMap.get("E-mail"));
		 * driver.findElement(By.name("password")).sendKeys(dataMap.get("Password"));
		 */	
	}
	
	@Then("User clicks on submit button")
	public void User_clicks_on_submit_button()
	{
		driver.findElement(By.xpath("//input[@value='Submit']")).click();
	}
}	