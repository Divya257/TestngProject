package baseFunctions;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;

public class BasicFunctions {
	public static WebDriver driver;
	
		public static void browserlaunch(String option) {
			
				try {
					if(option.equalsIgnoreCase("chrome")) {
						driver=new ChromeDriver();
					}else if(option.equalsIgnoreCase("edge")) {
						driver=new EdgeDriver();
					}
					driver.manage().window().maximize();
					driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
		}
		public static void urlgo(String url) {
			try {
				driver.get(url);
			}catch(Exception e) {
				e.printStackTrace();
			}
			
		}
	public static void clicks(WebElement ele) {
		try {
			ele.click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void sendkeyss(WebElement ele,String value) {
		try {
			ele.sendKeys(value);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static String getAttributes(WebElement ele,String attribute) {
		String attribute2=ele.getAttribute(attribute);
		return attribute2;
	}
	public static void fullscreenshort(String name) {

		try {
			TakesScreenshot ts=(TakesScreenshot)driver;
			File src = ts.getScreenshotAs(OutputType.FILE);
			File des= new File("C:\\Users\\91909\\eclipse-workspace\\Selenium\\Bugs\\"+name+".png");
			FileHandler.copy(src, des);
		} catch (WebDriverException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static boolean elementVisibility(WebElement ele) {
		boolean displayed=false;
		try {
			
			displayed=ele.isDisplayed();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return displayed;
	}
		public static String retriveText(WebElement ele) {
			return ele.getText();
			}
		
		
			
		}
	
	
	
	
	


