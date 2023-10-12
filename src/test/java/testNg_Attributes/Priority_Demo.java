package testNg_Attributes;

import org.testng.annotations.Test;

public class Priority_Demo {
	@Test(priority = 0)//in which order pgm can be run we can use "priority"
	public void username() {
		System.out.println("Username");
	}
	
	@Test(priority = 1)
	public void Password() {
		System.out.println("Password");
	}

	@Test(priority = 2)
	public void login() {
		System.out.println("Logoin");
		
	}
	
}
