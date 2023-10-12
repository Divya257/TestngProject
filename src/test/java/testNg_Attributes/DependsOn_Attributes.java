package testNg_Attributes;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOn_Attributes {
	@Test
	private void Primary() {
		System.out.println("Primary school");
		Assert.fail();
	}
	@Test(dependsOnMethods = "Primary",alwaysRun = true)//always run means if the method fail other method run without any break
	private void Secondary() {
		System.out.println("Secondary School");
	
	}
	@Test(dependsOnMethods = {"Secondary","Primary"},alwaysRun = true)
	private void Higher() {
		System.out.println("Higher");
	}
	@Test(dependsOnMethods = "Higher")
	private void College() {
		System.out.println("College");
	}
}
