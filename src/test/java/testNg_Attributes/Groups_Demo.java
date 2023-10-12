package testNg_Attributes;

import org.testng.annotations.Test;

public class Groups_Demo {
	@Test(groups = "odd")
	private void first() {
		System.out.println("First");
	}
	@Test(groups = "even")
	private void second() {
		System.out.println("second");
	}
	@Test(groups = "odd")
	private void Third() {
		System.out.println("Third");
	}
	@Test(groups="even")
	private void Fourth() {
		System.out.println("Fourth");
	}

}
