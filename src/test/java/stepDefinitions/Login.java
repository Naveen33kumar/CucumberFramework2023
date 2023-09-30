package stepDefinitions;

import java.io.FileNotFoundException;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import factory.DriverFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.LoginPage;

public class Login extends DriverFactory{

	LoginPage lp = new LoginPage(driver);
	HomePage hm = new HomePage(driver);
	
	public Login() throws FileNotFoundException {
		super();
	}

@Given("User has entered valid user id {string} into the user id field")
public void user_has_entered_valid_user_id_into_the_user_id_field(String uid) {
	lp.setUid(uid);
}

@And("User has entered valid password {string} into the password field")
public void user_has_entered_valid_password_into_the_password_field(String password) {
	lp.setPassword(password);
}

@And("User clicks on login button")
public void clickLogin() {
    lp.clickLoginButton();
}

@Then("User should successfully logged in")
public void user_should_successfully_logged_in() {
    Assert.assertEquals(hm.getHomePageTitle(), "Guru99 Bank Manager HomePage");
}

@Given("^User enters invalid user id (.+) into the user id field$")
public void user_enters_invalid_user_id_into_the_user_id_field(String uid) {
	
	lp.setUid(uid);
}

@Given ("^User enters the invalid password (.+) into the password field$")
public void user_enters_the_invalid_password_into_the_password_field(String password) {
	lp.setPassword(password);
	hm = lp.clickLoginButton();
	
}

@Then("User should end up with warning alert on the screen")
public void user_should_end_up_with_warning_alert_on_the_screen() {
    Alert alert = driver.switchTo().alert();
    String alertText = alert.getText();
    Assert.assertEquals(alertText, "User or Password is not valid");
    alert.accept();
}
}