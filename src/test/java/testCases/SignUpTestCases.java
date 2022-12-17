package testCases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import page_object.SignUpPageObjects;
import page_object.loginPageObject;
import resources.BaseClass;
import resources.Commonmethods;
import resources.Constant;

public class SignUpTestCases extends BaseClass {

	@Test
	public void veryfySignUp() throws IOException, InterruptedException {

		loginPageObject LPO = new loginPageObject(driver);

		LPO.ClickOnTryforfree().click(); // website madhe try for free var click karun apan next page(singUP) var janar
											// mhanun login page cha object banavala karan try for free chi method
											// loginpageobject ya class madhe ahe

		SignUpPageObjects spo = new SignUpPageObjects(driver); // signUP page chya method SignUPpageobject ya clas madhe
																// ahet mhanun tyacha object banavala

		Thread.sleep(10000);
		spo.Enterfirstname().sendKeys(Constant.firstname);

		spo.EnterLastname().sendKeys(Constant.lastname);

		spo.Jobtitle().sendKeys(Constant.jobtitle);

		spo.Email().sendKeys(Constant.Email);

		spo.PhoneNumber().sendKeys(Constant.mobilenmber);

		Commonmethods.commondropdowns(spo.SelectEmployeedropdown(), 2);// common method select employeedropdown

		spo.company().sendKeys(Constant.company);

		Thread.sleep(1000);
		Commonmethods.commondropdowns(spo.SelectCountry(), 3);// common method Select country

		Thread.sleep(1000);

		spo.checkbox1().click();

		spo.checkbox2().click();

	}
}
