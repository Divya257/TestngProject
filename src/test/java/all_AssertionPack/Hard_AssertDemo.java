package all_AssertionPack;

import org.testng.Assert;
import org.testng.annotations.Test;

import all_Elements.Swag_Elements;
import baseFunctions.BasicFunctions;

public class Hard_AssertDemo extends BasicFunctions {
	@Test
	private void check() {
		browserlaunch("chrome");
		urlgo("https://www.saucedemo.com/");
		Swag_Elements sc=new Swag_Elements(driver);
		sendkeyss(sc.getUser(), "standard_user");
		sendkeyss(sc.getPassword(), "secret_sauce");
		boolean act = sc.getLogin().isEnabled();
		Assert.assertTrue(act);
		clicks(sc.getLogin());
		
		String actual= driver.getCurrentUrl();
		String expected="https://www.saucedemo.com/inventory.html";
	
		Assert.assertEquals(actual, expected,"YOU MADE SOME MISTAKE");
		clicks(sc.getProduct());
		Assert.fail();
	
		
	}
}
