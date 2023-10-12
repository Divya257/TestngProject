package all_AssertionPack;


import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import all_Elements.Swag_Elements;
import baseFunctions.BasicFunctions;

public class Soft_AssertDemo extends BasicFunctions{
	@Test
	private void check() {
		browserlaunch("chrome");
		urlgo("https://www.saucedemo.com/");
		SoftAssert s=new SoftAssert();
		Swag_Elements sc=new Swag_Elements(driver);
		sendkeyss(sc.getUser(), "standard_user");
		sendkeyss(sc.getPassword(), "secret_sauce");
		boolean act = sc.getLogin().isEnabled();
		s.assertFalse(act);
		clicks(sc.getLogin());
		String actual= driver.getCurrentUrl();
		String expected="https://www.saucedemo.com/inventory";
		s.assertEquals(actual, expected,"YOU MADE SOME MISTAKE");
		clicks(sc.getProduct());
		s.assertAll();
}
}
