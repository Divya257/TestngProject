package dataProviderClass;

import org.testng.annotations.DataProvider;

public class DataProviderClass_Data {
	@DataProvider(name="SwagLogin")
	private String[][] swagDatas(){
		String data[][]=new String[4][2];
		data[0][0]="";		
		data[0][1]="";		
		data[1][0]="AAAA";		
		data[1][1]="1234";		
		data[2][0]="standard_user";		
		data[2][1]="Secretsauce";		
		data[3][0]="standard_user";		
		data[3][1]="secret_sauce";
		return data;		
		
		
	}

}
