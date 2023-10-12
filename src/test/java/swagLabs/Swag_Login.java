package swagLabs;
import all_Elements.Swag_Elements;
import baseFunctions.BasicFunctions;

public class Swag_Login extends BasicFunctions {

	public static void main(String[] args) {
		browserlaunch("edge");
		urlgo("https://www.saucedemo.com/");
		Swag_Elements sc=new Swag_Elements(driver);
		sendkeyss(sc.getUser(), "standard_user");
		sendkeyss(sc.getPassword(), "secret_sauce");
		clicks(sc.getLogin());
		clicks(sc.getProduct());
		
	}

}
