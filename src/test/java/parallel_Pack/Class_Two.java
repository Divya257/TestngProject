package parallel_Pack;

import org.testng.annotations.Test;

public class Class_Two extends ThreadLocalDriver {
	
	@Test
	public void FaceBook() {
		setDriver("chrome");
		urlgo("https://www.facebook.com/");
		long id = Thread.currentThread().getId();
		System.out.println(id);
	}

	@Test
	public void Instagram() {
		setDriver("chrome");
		urlgo("https://www.instagram.com/");
		long id = Thread.currentThread().getId();
		System.out.println(id);
	}

	@Test
	public void Twitter() {
		setDriver("chrome");
		urlgo("https://twitter.com/");
		long id = Thread.currentThread().getId();
		System.out.println(id);
	}


}
