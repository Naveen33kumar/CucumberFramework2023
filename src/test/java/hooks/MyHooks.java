package hooks;

import java.io.FileNotFoundException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import factory.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class MyHooks extends DriverFactory{

	public MyHooks() throws FileNotFoundException
	{
		super();
	}
	
	@Before
	public void setUp()
	{	
		DriverFactory.initializeBrowser(prop.getProperty("browser"));
		driver.get(prop.getProperty("url"));
	}
	
	@After
	public void tearDown(Scenario scenario)
	{
		 String scenarioName = scenario.getName().replaceAll(" ", "_");
		 
		 if(scenario.isFailed())
		 {
			 byte[] srcScreenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
			 
			 scenario.attach(srcScreenshot, "image/png", scenarioName); 
		 }
		 
		 driver.quit();
	}
}