package all_Elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Automationsite_Elements {
	
	@FindBy(xpath = "(//input[@type='text'])[1]")
	private WebElement first;
	@FindBy(xpath = "(//input[@type='text'])[2]")
	private WebElement Last;
	@FindBy(xpath = "//textarea[@ng-model='Adress']")
	private WebElement address;
	@FindBy(xpath = "//input[@type='email']")
	private WebElement email;
	@FindBy (xpath="//input[@type='tel']")
	private WebElement PhoneNo;
	@FindBy(xpath = "(//input[@type='radio'])[2]")
	private WebElement Gender;
	@FindBy(id =  "checkbox1")
	private WebElement Hobbies;
	@FindBy (xpath = "//div[@id='msdd']/div[1]")
	private WebElement Language;
	@FindBy(xpath = "//select[@id='Skills']/option[2]")
	private WebElement Skills;
	@FindBy (id="countries")
	private WebElement countries;
	@FindBy (xpath = "//span[@dir='ltr']/span/span/span[1]")
	private WebElement SelectCountry;
	@FindBy(xpath = "//select[@id='yearbox']/option[86]")
	private WebElement year;
	@FindBy(xpath = "//select[@placeholder='Month']/option[8]")
	private WebElement month;
	@FindBy(xpath = "//select[@id='daybox']/option[5]")
	private WebElement Date;
	@FindBy(id= "firstpassword")
	private WebElement Password;
	@FindBy(id="secondpassword")
	private WebElement ConfirmPwd;
	public Automationsite_Elements(WebDriver driver) {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}
	public WebElement getFirst() {
		return first;
	}
	public WebElement getLast() {
		return Last;
	}
	public WebElement getAddress() {
		return address;
	}
	public WebElement getEmail() {
		return email;
	}
	public WebElement getPhoneNo() {
		return PhoneNo;
	}
	public WebElement getGender() {
		return Gender;
	}
	public WebElement getHobbies() {
		return Hobbies;
	}
	public WebElement getLanguage() {
		return Language;
	}
	public WebElement getSkills() {
		return Skills;
	}
	public WebElement getCountries() {
		return countries;
	}
	public WebElement getSelectCountry() {
		return SelectCountry;
	}
	public WebElement getYear() {
		return year;
	}
	public WebElement getMonth() {
		return month;
	}
	public WebElement getDate() {
		return Date;
	}
	public WebElement getPassword() {
		return Password;
	}
	public WebElement getConfirmPwd() {
		return ConfirmPwd;
	}
	

}
