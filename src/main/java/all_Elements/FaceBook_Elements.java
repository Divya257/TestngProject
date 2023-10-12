package all_Elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FaceBook_Elements {
	@FindBy(id = "email")
	private WebElement user;
	@FindBy(id = "pass")
	private WebElement password;
	@FindBy(id = "loginbutton")
	private WebElement login;
	
	public FaceBook_Elements(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public WebElement getUser() {
		return user;
	}
	public WebElement getPassword() {
		return password;
	}
	public WebElement getLogin() {
		return login;
	}
	

}
