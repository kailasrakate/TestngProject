package resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

public class BaseClass {

	public WebDriver driver;

	public void browserinitialisation() throws IOException {

		// to read the properties
		FileInputStream fis = new FileInputStream(
				System.getProperty("user.dir") + "\\src\\main\\java\\resources\\data.properties");

		Properties prop = new Properties();

		prop.load(fis);

		String browserName = prop.getProperty("browser");

		if (browserName.equalsIgnoreCase("Chrome")) {

			driver = new ChromeDriver();

		} else if (browserName.equalsIgnoreCase("firefox")) {

			// firefox code cha code

		} else if (browserName.equalsIgnoreCase("operamini")) {

			// opera mini cha dode

		} else {

			System.out.println("Please Enter Valid Browser Name");

		}

	}

	@BeforeMethod
	public void browserlaunch() throws IOException {

		browserinitialisation();

		driver.get("https://login.salesforce.com/");

	}

}
