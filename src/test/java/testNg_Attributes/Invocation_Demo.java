package testNg_Attributes;

import org.testng.annotations.Test;

import baseFunctions.BasicFunctions;

public class Invocation_Demo extends BasicFunctions{// A process can repeat 3 times 
	@Test(invocationCount = 3)//instead of loop we can used to invocationCount to iterate the same process
	public void testname()throws Exception{
		browserlaunch("Chrome");
		urlgo("https://www.saucedemo.com/");
	}

}
