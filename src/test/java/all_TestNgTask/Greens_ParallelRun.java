package all_TestNgTask;

import org.testng.annotations.Test;

import parallel_Pack.ThreadLocalDriver;

public class Greens_ParallelRun extends ThreadLocalDriver{
	
	@Test
	public void one() {
		setDriver("chrome");
		urlgo("http://www.greenstechnologys.com/");
		long id = Thread.currentThread().getId();
		System.out.println(id);
	}

	@Test
	public void two() {
		setDriver("edge");
		urlgo("http://www.greenstechnologys.com/");
		long id = Thread.currentThread().getId();
		System.out.println(id);
	}

}
