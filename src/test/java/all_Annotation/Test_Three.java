package all_Annotation;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class Test_Three {
	  @BeforeClass
	  public void beforeClass() {
		  System.out.println("............BeforeClass-Test-3----------");
	  }
	
	  @BeforeMethod
	  public void beforeMethod() {
		  System.out.println("..........BrforeMethod-Test-3.............");
	  }

	@Test
  	public void f() {
		System.out.println("Three");
  }
 

	@AfterMethod
  	public void afterMethod() {
		System.out.println("...............After Method-Test-3.........");
  }

 
	@AfterClass
  	public void afterClass() {
		System.out.println("...............After Class Test-3..............");
  }

}
