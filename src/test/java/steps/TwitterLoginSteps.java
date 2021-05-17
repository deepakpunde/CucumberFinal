package steps;

import static org.junit.Assert.assertEquals;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Utils.Log;
import dataProvider.ConfigFileReader;
import elements.TwitterLoginElements;
import elements.TwitterNavigationBarElements;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TwitterLoginSteps {
	//Variable declaration
	WebDriver driver;
	WebDriverWait wait;
	TwitterLoginElements objTwitter_Login_Elements;
	TwitterNavigationBarElements objTwitterNavigationBarElements;
	CommonSteps objCommonSteps;
	ConfigFileReader configFileReader;
	
	//Constructor - Picocontainer helps here
	public TwitterLoginSteps(CommonSteps objCommonSteps) {
		this.driver = objCommonSteps.getDriver();
		wait = objCommonSteps.getWait();
		
		objTwitter_Login_Elements = new TwitterLoginElements(driver);
		objTwitterNavigationBarElements = new TwitterNavigationBarElements(driver);
		this.objCommonSteps = objCommonSteps;
	}
	
	@Given("User is on the Twitter Login page")
	public void User_is_on_the_Twitter_Login_page() throws InterruptedException {
		configFileReader = new ConfigFileReader();
		driver.get(configFileReader.getApplicationUrl());
		Thread.sleep(5000);
		Log.info("User is on the Twitter Login page");
	}
	
	@Then("Log in button should be disabled")
	public void Log_in_button_should_be_disabled() {
		if(objTwitter_Login_Elements.btnLogin.isDisplayed()) {
			String attribValue = objTwitter_Login_Elements.btnLogin.getAttribute("aria-disabled");
			assertEquals(attribValue,"true");
		}
		Log.info("Log in button is disabled");
	}
		
	@When("User enters incorrect user name")
	public void user_enters_incorrect_user_name() {
		String getRandomString = RandomStringUtils.randomAlphanumeric(8);
		objTwitter_Login_Elements.textFieldUserName.sendKeys(getRandomString);
		Log.info("User entered incorrect user name");
	}

	@When("User enters incorrect Password")
	public void user_enters_incorrect_Password() {
		String getRandomString = RandomStringUtils.randomAlphanumeric(8);
		objTwitter_Login_Elements.textFieldPassword.sendKeys(getRandomString);
		Log.info("User entered incorrect user Password");
	}
	
	@When("User clicks on login button")
	public void user_clicks_on_login_button() {
		objTwitter_Login_Elements.btnLogin.click();
		Log.info("Login button clicked");
	}

	@Then("Invalid username or password message should be displayed")
	public void invalid_username_or_password_message_should_be_displayed() {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[contains(text(),'The username and password you entered did not match our records. Please double-check and try again.')]")));
	    boolean isErrMsgDisplayed = objTwitter_Login_Elements.textInvalidUserNameOrPasswordMessage.isDisplayed();
	    assertEquals(isErrMsgDisplayed,true);
	    Log.info("Invalid username or password message is displayed");
	}
	
	@When("User enters valid user name")
	public void user_enters_valid_user_name() {
		objTwitter_Login_Elements.textFieldUserName.sendKeys("deepakpunde1");
		Log.info("Valid username entered");
	}

	@When("User enters valid Password")
	public void user_enters_valid_Password() {
		objTwitter_Login_Elements.textFieldPassword.sendKeys("P@ssw0rd");
		Log.info("Valid Password entered");
	}

	@Then("User is redirected to Home page")
	public void user_is_redirected_to_Home_page() {
		wait.until(ExpectedConditions.visibilityOf(objTwitterNavigationBarElements.labelTwitterAccountMenu));
		
		//Verify that after successful login - twitter user account label is displayed i.e. @deepakpunde1
		boolean isHomePageDisplayed = objTwitterNavigationBarElements.labelTwitterAccountMenu.isDisplayed();
		assertEquals(isHomePageDisplayed,true);
		Log.info("User is redirected to Home page");
		objCommonSteps.logout();
	}
}
