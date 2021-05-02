package elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TwitterLoginElements {
	//One _Elements class for one .feature file.
	//This class will contain all the elements which are utilized in the feature.
	WebDriver driver;
	
	@FindBy(xpath="//div[@role='button' and @data-testid=\"LoginForm_Login_Button\"]") public WebElement btnLogin;
	
	public TwitterLoginElements(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
}