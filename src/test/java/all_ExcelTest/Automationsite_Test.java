package all_ExcelTest;

import java.io.IOException;

import all_Elements.Automationsite_Elements;
import all_ExcelData.Automationsite_Data;
import baseFunctions.BasicFunctions;

public class Automationsite_Test extends BasicFunctions {
	public static void main(String[] args) throws IOException {
		browserlaunch("chrome");
		urlgo("https://demo.automationtesting.in/Register.html");
		Automationsite_Data ad = new Automationsite_Data();
		ad.loadExcels();
		Automationsite_Elements ae=new Automationsite_Elements(driver);
		sendkeyss(ae.getFirst(), ad.getFirstname());
		sendkeyss(ae.getLast(), ad.getLastname());
		sendkeyss(ae.getAddress(), ad.getAddress());
		sendkeyss(ae.getPhoneNo(), ad.getPhoneno());
		clicks(ae.getGender());
		clicks(ae.getHobbies());
		clicks(ae.getLanguage());
		clicks(ae.getSkills());
		clicks(ae.getCountries());
		clicks(ae.getSelectCountry());
		clicks(ae.getYear());
		clicks(ae.getMonth());
		clicks(ae.getDate());
		sendkeyss(ae.getPassword(), ad.getPassword());
		sendkeyss(ae.getConfirmPwd(), ad.getConfirmPassword());
		
	}

}
