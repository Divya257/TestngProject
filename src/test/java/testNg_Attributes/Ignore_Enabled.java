package testNg_Attributes;

import org.testng.annotations.Test;

public class Ignore_Enabled {
	@Test
	private void aaa() {
		System.out.println("aaa");
	}
	@Test(enabled = false)
	private void bbb() {
		System.out.println("bbb");
	}
	@Test
	private void ccc() {
		System.out.println("ccc");
	}
	

}
