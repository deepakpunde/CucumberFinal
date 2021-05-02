package elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TwitterProfileElements {
	//One _Elements class for one .feature file.
	//This class will contain all the elements which are utilized in the feature.
	WebDriver driver;
	
	@FindBy(xpath="//span[contains(text(),'Profile')]") public WebElement linkProfile;
	@FindBy(xpath="//span[normalize-space(.) = 'Edit profile']") public WebElement linkEditProfile;
	@FindBy(xpath="//div[@aria-label='Add avatar photo']//following-sibling::input[@type='file' and @data-testid='fileInput']") public WebElement eleAddProfilePhoto;	
	@FindBy(xpath="//textarea[@name='description']") public WebElement eleBio;
	@FindBy(xpath="//input[@name='location']") public WebElement eleLocation;
	@FindBy(xpath="//input[@name='url']") public WebElement eleWebsite;
	@FindBy(xpath="//span[normalize-space(text()) = 'Save']") public WebElement eleSave;
	
	public TwitterProfileElements(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
}