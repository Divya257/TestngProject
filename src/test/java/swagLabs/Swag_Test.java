package swagLabs;

import java.io.IOException;

import all_Elements.Swag_Elements;
import all_ExcelData.Swag_Data;
import baseFunctions.BasicFunctions;

public class Swag_Test extends BasicFunctions{
	public static void main(String[] args) throws IOException {
		browserlaunch("chrome");
		Swag_Data sd=new Swag_Data();
		sd.loadExcel();
		urlgo(sd.geturl());
		Swag_Elements sc=new Swag_Elements(driver);
		sendkeyss(sc.getUser(), sd.getUsername());
		sendkeyss(sc.getPassword(), sd.getPassword());
		clicks(sc.getLogin());
		String act = driver.getCurrentUrl();
		boolean equals = sd.getExpected().equals(act);
		sd.writeResults(equals, act);
	}

}
