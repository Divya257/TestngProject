package all_TestNgTask;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import all_Elements.RedBus_Elements;
import baseFunctions.BasicFunctions;

public class RedBus extends BasicFunctions{
	
	@Parameters({"mail","pass"})
	@Test
	public void Red(String mail,String pass)throws Exception {
		browserlaunch("chrome");
		urlgo("https://www.redbus.in/");
		RedBus_Elements rb=new RedBus_Elements(driver);
		clicks(rb.getAccount());
		clicks(rb.getSignup());
		Thread.sleep(3000);
		clicks(rb.getSiginGoogle());
		sendkeyss(rb.getEmail(), mail);
		clicks(rb.getNext1());
		sendkeyss(rb.getPassword(), pass);
		clicks(rb.getNext2());
	}

}
