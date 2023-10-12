package dataProviderPack;
import org.testng.annotations.Test;

import all_Elements.Swag_Elements;
import baseFunctions.BasicFunctions;
import dataProviderClass.DataProviderClass_Data;

public class DataProviderAndClass extends BasicFunctions{
	
	@Test(dataProvider = "SwagLogin",dataProviderClass = DataProviderClass_Data.class)
	public void testName(String user,String pass)throws Exception {
		browserlaunch("edge");
		urlgo("https://www.saucedemo.com/");
		Swag_Elements sc=new Swag_Elements(driver);
		sendkeyss(sc.getUser(), user);
		sendkeyss(sc.getPassword(), pass);
		clicks(sc.getLogin());

}
}
