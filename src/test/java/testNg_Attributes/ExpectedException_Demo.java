package testNg_Attributes;

import org.testng.annotations.Test;

public class ExpectedException_Demo {
	@Test(expectedExceptions = NullPointerException.class)
	public void aaaa() {
		throw new ArrayIndexOutOfBoundsException();
	}
	@Test(expectedExceptions = NullPointerException.class)
	public void bbbb() {
		throw new NullPointerException();
		
	}

}
