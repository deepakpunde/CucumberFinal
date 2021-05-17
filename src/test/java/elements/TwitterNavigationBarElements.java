package elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TwitterNavigationBarElements {
	//Variable declaration
	WebDriver driver;
	
	@FindBy(xpath="//div/span[contains(text(),'@deepakpunde1')]") public WebElement labelTwitterAccountMenu;
	
	//Constructor
	public TwitterNavigationBarElements(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
}