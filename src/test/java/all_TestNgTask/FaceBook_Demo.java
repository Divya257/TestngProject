package all_TestNgTask;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import all_Elements.FaceBook_Elements;
import baseFunctions.BasicFunctions;

public class FaceBook_Demo extends BasicFunctions {
	
	@Parameters({"user","pass"})
	@Test
	public void testName(@Optional("problem_user")String user,
			@Optional("secret_sauce") String pass)throws Exception {
		browserlaunch("chrome");
		urlgo("https://www.facebook.com/login/device-based/regular/login/?login_attempt=1&lwv=100");
		FaceBook_Elements fb=new FaceBook_Elements(driver);
		sendkeyss(fb.getUser(), user);
		sendkeyss(fb.getPassword(), pass);
		clicks(fb.getLogin());

	}
}
