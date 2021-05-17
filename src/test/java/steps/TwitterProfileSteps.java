package steps;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import elements.TwitterLoginElements;
import elements.TwitterNavigationBarElements;
import elements.TwitterProfileElements;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TwitterProfileSteps {
	//Variable declaration
	WebDriver driver;
	WebDriverWait webdriverwait;
	TwitterLoginElements objTwitter_Login_Elements;
	TwitterNavigationBarElements objTwitterNavigationBarElements;
	TwitterProfileElements objTwitterProfileElements;
	
	CommonSteps objCommonSteps;
	
	String strBio = "Selenium Automation user";
	String strLocation = "Pune";
	String strWebSite = "in.yahoo.com";
	
	//Constructor - Picocontainer helps here
	public TwitterProfileSteps(CommonSteps objCommonSteps) {
		this.driver = objCommonSteps.getDriver();
		objTwitter_Login_Elements = new TwitterLoginElements(driver);
		objTwitterProfileElements = new TwitterProfileElements(driver);
		objTwitterNavigationBarElements = new TwitterNavigationBarElements(driver);
		this.objCommonSteps = objCommonSteps;
	}
	
	@Given("User is on the Twitter Home page")
	public void user_is_on_the_Twitter_Home_page() {
		driver.get("https://twitter.com/login");
		objTwitter_Login_Elements.textFieldUserName.sendKeys("deepakpunde1");
		objTwitter_Login_Elements.textFieldPassword.sendKeys("P@ssw0rd");
		objTwitter_Login_Elements.btnLogin.click();
		boolean isHomePageDisplayed = objTwitterNavigationBarElements.labelTwitterAccountMenu.isDisplayed();
		assertEquals(isHomePageDisplayed,true);
	}

	@When("User selects to edit profile")
	public void user_selects_to_edit_profile() {
	    // Write code here that turns the phrase above into concrete actions
		objTwitterProfileElements.linkProfile.click();
		objTwitterProfileElements.linkEditProfile.click();
	}

	@Then("User should see edit profile page")
	public void user_should_see_edit_profile_page() {
		boolean isEditProfilePageDisplayed = driver.findElement(By.xpath("//span[normalize-space(text()) = 'Edit profile']")).isDisplayed();
		assertEquals(isEditProfilePageDisplayed,true);
		System.out.println("Edit profile page displayed.");
	  
	}
	
	@When("User should update profile picture")
	public void User_should_update_profile_picture() {
		driver.findElement(By.xpath("//div[@aria-label='Add avatar photo']/following::input[@data-testid='fileInput']")).sendKeys("D:\\Deutsche Workspace\\cucumber\\Files\\TestImage.png");
		driver.findElement(By.xpath("//span[contains(text(),'Apply')]")).click();
		//driver.findElement(By.xpath("//span[contains(text(),'Save')]")).click();
	}

	@When("User should update Bio")
	public void user_should_update_Bio() {
		objTwitterProfileElements.eleBio.clear();
		objTwitterProfileElements.eleBio.sendKeys(strBio);
	    System.out.println("User have updated Bio");
	}

	@When("user should update Location")
	public void user_should_update_Location() {
		objTwitterProfileElements.eleLocation.clear();
		objTwitterProfileElements.eleLocation.sendKeys(strLocation);
		System.out.println("User have updated Location");
	}

	@When("User should update Website")
	public void user_should_update_Website() {
		objTwitterProfileElements.eleWebsite.clear();
		objTwitterProfileElements.eleWebsite.sendKeys(strWebSite);
	    System.out.println("User have updated Website");
	}
	
	@When("User saves updated profile")
	public void user_saves_updated_profile() {
		objTwitterProfileElements.eleSave.click();
	    System.out.println("User have updated Profile");
	}
	
	@Then("User should confirm the updated profile")
	public void user_should_confirm_the_updated_profile() {
		System.out.println("Updated Bio = "+driver.findElement(By.xpath("//div[@data-testid='UserDescription']/span")).getText());
		assertTrue(driver.findElement(By.xpath("//div[@data-testid='UserDescription']/span")).getText().contentEquals(strBio));
		
		System.out.println("Updated Location = "+driver.findElement(By.xpath("//div[@data-testid='UserProfileHeader_Items']/span/span/span")).getText());
		assertTrue(driver.findElement(By.xpath("//div[@data-testid='UserProfileHeader_Items']/span/span/span")).getText().contentEquals(strLocation));
		
		System.out.println("Updated Website = "+driver.findElement(By.xpath("//div[@data-testid='UserProfileHeader_Items']/a")).getText());
		assertTrue(driver.findElement(By.xpath("//div[@data-testid='UserProfileHeader_Items']/a")).getText().contentEquals(strWebSite));
		
		System.out.println("Update profile confirmed");
	}
}
