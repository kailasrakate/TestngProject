package testCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import page_object.SignUpPageObjects;
import page_object.loginPageObject;
import resources.BaseClass;
import resources.Commonmethods;
import resources.Constant;

public class logInTestsCase extends BaseClass {

	@Test
	public void method1() throws IOException, InterruptedException {

		// driver.findElement(By.xpath("//input[@//id='username']")); hiline ashi lihit
		// nahit mhanu apan yala devide keli

		loginPageObject LPO = new loginPageObject(driver);

		LPO.enterUsername().sendKeys(Constant.username);

		LPO.EnterPassword().sendKeys(Constant.EnterPassword);

		LPO.ClickOnlogin().click();

		LPO.ErrorMessage().getText();

		Commonmethods.assertionmethod(LPO.ErrorMessage().getText(), Constant.ExpectedText);

		Thread.sleep(3000);

		LPO.frorgotyourPassword().getText();

		Commonmethods.assertionmethod(LPO.frorgotyourPassword().getText(), Constant.forgotyourpasswordText);

		LPO.ClickOnTryforfree().click(); //

	}

}
