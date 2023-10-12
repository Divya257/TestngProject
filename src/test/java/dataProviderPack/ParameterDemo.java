package dataProviderPack;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import all_Elements.Swag_Elements;
import baseFunctions.BasicFunctions;

public class ParameterDemo extends BasicFunctions {
	@Parameters({"user","pass","url"})
	@Test
	public void testName(@Optional("problem_user")String user,
			@Optional("secret_sauce") String pass,String url)throws Exception {
		browserlaunch("chrome");
		urlgo(url);
		Swag_Elements sc=new Swag_Elements(driver);
		sendkeyss(sc.getUser(), user);
		sendkeyss(sc.getPassword(), pass);
		clicks(sc.getLogin());
	}

}
