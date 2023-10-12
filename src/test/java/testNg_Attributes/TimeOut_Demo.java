package testNg_Attributes;

import org.testng.annotations.Test;

import baseFunctions.BasicFunctions;

public class TimeOut_Demo extends BasicFunctions{
	@Test(timeOut = 10000,priority = 0,//process can be run within the mentioned timeout period if it run means success or not means it fail
			description = "This Method used to tesst the Timeout test")//also we can able to provide the description use this.
	private void swagTest() {
		browserlaunch("chrome");
		urlgo("https://www.saucedemo.com/");
	}
	

}
