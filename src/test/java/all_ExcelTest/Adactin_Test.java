package all_ExcelTest;

import java.io.IOException;

import all_Elements.Adactin_Elements;
import all_ExcelData.Adactin_Data;
import baseFunctions.BasicFunctions;

public class Adactin_Test extends BasicFunctions {
	public static void main(String[] args) throws IOException {
		browserlaunch("chrome");
		Adactin_Data ad=new Adactin_Data();
		ad.loadExcel();
		urlgo(ad.getURL());
		Adactin_Elements ae=new Adactin_Elements(driver);
		sendkeyss(ae.getUser(),ad.getUsername());
		sendkeyss(ae.getPass(),ad.getPassword());
		clicks(ae.getLogin());
		
	}

}
