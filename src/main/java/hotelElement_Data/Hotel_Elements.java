package hotelElement_Data;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Hotel_Elements {
	@FindBy(id = "username")
	private WebElement user;
	@FindBy (id = "password")
	private WebElement pass;
	@FindBy(id = "login")
	private WebElement login;
	public Hotel_Elements(WebDriver driver) {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}
	public WebElement getUser() {
		return user;
	}
	public WebElement getPass() {
		return pass;
	}
	public WebElement getLogin() {
		return login;
	}


}
