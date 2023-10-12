package parallel_Pack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ThreadLocalDriver {

	private static ThreadLocal<WebDriver> driver=new ThreadLocal<>();
	
	public static void setDriver(String option) {
		if(option.equalsIgnoreCase("chrome")) {
			driver.set(new ChromeDriver());
		}else if (option.equalsIgnoreCase("edge")) {
			driver.set(new EdgeDriver());
		}
		getDriver().manage().window().maximize();
	}

	public static WebDriver getDriver() {
		// TODO Auto-generated method stub
		return driver.get();
	}
	
	public static void urlgo(String url) {
		getDriver().get(url);
	}
	
	
	
	
	
	
	
}
