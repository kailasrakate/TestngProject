package page_object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignUpPageObjects {

	public WebDriver driver;

	// send keys on first name
	private By firstname = By.xpath("//input[@name='UserFirstName']");

	// send keys on last name
	private By Lastname = By.xpath("//input[@name='UserLastName']");

	// send keys in job title
	private By jobtital = By.xpath("//input[@name='UserTitle']");

	// send keys in email
	private By email = By.xpath("//input[@Type='email']");

	// send keys in phone number
	private By phoneNumber = By.xpath("//input[@name='UserPhone']");

	// select on job title dropdown
	By SelectEmployee = By.xpath("//select[@name='CompanyEmployees']");

	// send keys in company
	By company = By.xpath("(//input[@Type='text'])[5]");

	// select country and religion dropdown
	By country = By.xpath("//select[@name='CompanyCountry']");

	
	// I agree to the Main Services Agreement checkbox
	By bottomcheckbox = By.xpath("(//div[@class='checkbox-ui'])[2]");

	public SignUpPageObjects(WebDriver driver2) {

		this.driver = driver2;

	}

	public WebElement Enterfirstname() {

		return driver.findElement(firstname);
	}

	public WebElement EnterLastname() {

		return driver.findElement(Lastname);
	}

	public WebElement SelectEmployeedropdown() {

		return driver.findElement(SelectEmployee);
	}

	public WebElement Jobtitle() {

		return driver.findElement(jobtital);
	}

	public WebElement Email() {

		return driver.findElement(email);
	}

	public WebElement PhoneNumber() {

		return driver.findElement(phoneNumber);

	}

	public WebElement SelectEmployee() {

		return driver.findElement(SelectEmployee);
	}

	public WebElement company() {

		return driver.findElement(company);

	}

	public WebElement SelectCountry() {

		return driver.findElement(country);
	}

	
	

	public WebElement checkbox() {

		return driver.findElement(bottomcheckbox);
	}

}
