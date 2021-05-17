package elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TwitterProfileElements {
	//Variable declaration
	WebDriver driver;
	
	@FindBy(xpath="//span[contains(text(),'Profile')]") public WebElement linkProfile;
	@FindBy(xpath="//span[normalize-space(.) = 'Edit profile']") public WebElement linkEditProfile;	
	@FindBy(xpath="//span[normalize-space(text()) = 'Edit profile']") public WebElement labelEditProfile;	
	@FindBy(xpath="//div[@aria-label='Add avatar photo']//following-sibling::input[@type='file' and @data-testid='fileInput']") public WebElement eleAddProfilePhoto;	
	@FindBy(xpath="//textarea[@name='description']") public WebElement eleBio;
	@FindBy(xpath="//input[@name='location']") public WebElement eleLocation;
	@FindBy(xpath="//input[@name='url']") public WebElement eleWebsite;
	@FindBy(xpath="//span[normalize-space(text()) = 'Save']") public WebElement eleSave;
	
	//Constructor
	public TwitterProfileElements(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
}