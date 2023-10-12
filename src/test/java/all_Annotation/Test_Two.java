package all_Annotation;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class Test_Two {
	 @BeforeTest
	  public void beforeTest() {
		 System.out.println("-----Before Test-2------");
	  }
	
	@Test
	public void f() {
		System.out.println("Two");
  }
  

	@AfterTest
  	public void afterTest() {
		System.out.println("------After Test-2--------");
  }

}
