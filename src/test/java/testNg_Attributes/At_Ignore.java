package testNg_Attributes;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class At_Ignore {
	@Ignore//Hide one method using @Ignore method
	@Test
	public void one() {
		System.out.println("one");
	}
	@Test
	public void two() {
		System.out.println("Two");
	}
	@Test
	public void three() {
		System.out.println("three");
	}

}
