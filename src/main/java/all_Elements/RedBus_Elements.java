package all_Elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RedBus_Elements {
	@FindBy(xpath = "(//div[@class='rb_main_secondary_item  link'])[2]/i[1]")
	private WebElement account;
	@FindBy(xpath = "//div[@class='dropdown_wrap']/ul/li[5]/span")
	private WebElement signup;
	@FindBy(xpath = "(//span[text()='Sign in with Google'])[1]")
	private WebElement siginGoogle;
	@FindBy (id = "identifierId")
	private WebElement email;
	@FindBy(xpath = "(//span[@class='VfPpkd-vQzf8d'])[2]")
	private WebElement next1;
	@FindBy(xpath = "(//input[@class='whsOnd zHQkBf'])[1]")
	private WebElement password;
	@FindBy(xpath = "(//span[@class='VfPpkd-vQzf8d'])[2]")
	private WebElement next2;
	public RedBus_Elements(WebDriver driver) {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}
	public WebElement getAccount() {
		return account;
	}
	public WebElement getSignup() {
		return signup;
	}
	public WebElement getSiginGoogle() {
		return siginGoogle;
	}
	public WebElement getEmail() {
		return email;
	}
	public WebElement getNext1() {
		return next1;
	}
	public WebElement getPassword() {
		return password;
	}
	public WebElement getNext2() {
		return next2;
	}
	
}
