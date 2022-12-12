package resources;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

public class Commonmethods {

	public static void commondropdowns(WebElement dropdown, int index) {

		Select s = new Select(dropdown);

		s.selectByIndex(index);
	}

	public static void assertionmethod(String actualText, String ExpectedText) {

		SoftAssert assertion = new SoftAssert();

		String actual = actualText;

		String Expected = ExpectedText;

		assertion.assertEquals(actual, Expected);

		assertion.assertAll();

	}

}
