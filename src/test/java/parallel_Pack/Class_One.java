package parallel_Pack;

import org.testng.annotations.Test;

public class Class_One extends ThreadLocalDriver {
	@Test
	public void Flipkart() {
		setDriver("chrome");
		urlgo("https://www.flipkart.com/");
		long id = Thread.currentThread().getId();
		System.out.println(id);
	}
	
	@Test
	public void Amazon() {
		setDriver("chrome");
		urlgo("https://www.Amazon.com/");
		long id = Thread.currentThread().getId();
		System.out.println(id);
	}

	@Test
	public void Myntra() {
		setDriver("chrome");
		urlgo("https://www.myntra.com/");
		long id = Thread.currentThread().getId();
		System.out.println(id);
	}

}
