package dataProviderPack;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import all_Elements.Swag_Elements;
import baseFunctions.BasicFunctions;

public class CrossBrowser extends BasicFunctions{
	
	@Parameters("browser")
	@Test
	public void testName(@Optional("Edge")String brows)throws Exception {
		browserlaunch(brows);
		urlgo("https://www.saucedemo.com/");
		Swag_Elements sc=new Swag_Elements(driver);
		sendkeyss(sc.getUser(), "standard_user");
		sendkeyss(sc.getPassword(), "secret_sauce");
		clicks(sc.getLogin());

}
}
