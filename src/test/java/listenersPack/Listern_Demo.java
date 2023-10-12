package listenersPack;

import org.testng.Assert;
import org.testng.annotations.Test;

import parallel_Pack.ThreadLocalDriver;

public class Listern_Demo extends ThreadLocalDriver{
	
	@Test
	public void Flipkart() {
		setDriver("chrome");
		urlgo("https://www.flipkart.com/");
		long id = Thread.currentThread().getId();
		System.out.println(id);
	}
	
	@Test(timeOut = 2000)
	public void Amazon() {
		setDriver("chrome");
		urlgo("https://www.Amazon.com/");
		long id = Thread.currentThread().getId();
		System.out.println(id);
	
	}
	@Test
	public void FaceBook() {
		setDriver("chrome");
		urlgo("https://www.facebook.com/");
		long id = Thread.currentThread().getId();
		System.out.println(id);
	}
	
	@Test(dependsOnMethods = "Amazon")
	public void ebay() {
		setDriver("chrome");
		urlgo("https://www.ebay.com/");
		long id = Thread.currentThread().getId();
		System.out.println(id);
	}

	@Test
	public void Instagram() {
		setDriver("chrome");
		urlgo("https://www.instagram.com/");
		long id = Thread.currentThread().getId();
		System.out.println(id);
		Assert.fail();
	}

}
