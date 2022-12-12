package page_object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class loginPageObject {

	public WebDriver driver;

	// userName
	private By username = By.xpath("//input[@id='username']");

	// paasword
	private By Password = By.xpath("//input[@id='password']");

	// login
	private By login = By.xpath("//input[@type='submit']");

	// error message
	private By Errormessage = By.xpath("//div[@id='error']");

	// click on try for free
	private By tryforfree = By.xpath("//a[@id='signup_link']");

	private By forgotyourpassword = By.xpath("//a[@class='fl small']");

	public loginPageObject(WebDriver driver2) {

		this.driver = driver2;
	}

	public WebElement enterUsername() {

		return driver.findElement(username);

	}

	public WebElement EnterPassword() {

		return driver.findElement(Password);

	}

	public WebElement ClickOnlogin() {

		return driver.findElement(login);

	}

	public WebElement ClickOnTryforfree() {

		return driver.findElement(tryforfree);

	}

	public WebElement ErrorMessage() {

		return driver.findElement(Errormessage);
	}

	public WebElement frorgotyourPassword() {

		return driver.findElement(forgotyourpassword);
	}

}
