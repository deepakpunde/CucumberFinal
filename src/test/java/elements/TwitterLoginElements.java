package elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TwitterLoginElements {
	//Variable declaration
	WebDriver driver;
	
	@FindBy(xpath="//div[@role='button' and @data-testid=\"LoginForm_Login_Button\"]") public WebElement btnLogin;
	@FindBy(xpath="//input[@name='session[username_or_email]']") public WebElement textFieldUserName;
	@FindBy(xpath="//input[@name='session[password]']") public WebElement textFieldPassword;	
	@FindBy(xpath="//*[contains(text(),'The username and password you entered did not match our records. Please double-check and try again.')]") public WebElement textInvalidUserNameOrPasswordMessage;
	
	//Constructor
	public TwitterLoginElements(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
}