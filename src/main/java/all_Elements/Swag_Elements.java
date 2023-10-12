package all_Elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Swag_Elements {
	
	
	@FindBy(id="user-name")
	private WebElement user;
	@FindBy(id="password")
	private WebElement password;
	@FindBy(id="login-button")
	private WebElement login;
	@FindBy(xpath = "(//img[@class='inventory_item_img'])[1]")
	private WebElement product;
		
	public Swag_Elements(WebDriver driver) {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver,this);
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
	public WebElement getProduct() {
		return product;
	}
		
	
	

}
