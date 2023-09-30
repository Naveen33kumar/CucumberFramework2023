package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

	public static Properties prop;
	
	public static Properties intializeProperties() throws FileNotFoundException
	{
		prop = new Properties();
		try {
		FileInputStream fis = new FileInputStream("C:\\Users\\navee\\eclipse-workspace\\SavingsBanksApplicationCucumberFramework\\src\\test\\resources\\config\\config.properties");
			prop.load(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return prop;
	}
}