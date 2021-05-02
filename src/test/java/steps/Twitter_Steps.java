package steps;

import static org.junit.Assert.assertEquals;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import elements.TwitterLoginElements;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Twitter_Steps {
	
	WebDriver driver;
	WebDriverWait webdriverwait;
	TwitterLoginElements objTwitter_Home_Elements;
	CommonSteps objCommonSteps;
	
	//Picocontainer helps here
	public Twitter_Steps(CommonSteps objCommonSteps) {
		this.driver = objCommonSteps.getDriver();
		objTwitter_Home_Elements = new TwitterLoginElements(driver);
		this.objCommonSteps = objCommonSteps;
	}
	
	@Given("User is on the Twitter Login page")
	public void User_is_on_the_Twitter_Login_page() {
		driver.get("https://twitter.com/login");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	@Then("Log in button should be disabled")
	public void Log_in_button_should_be_disabled() {
		if(objTwitter_Home_Elements.btnLogin.isDisplayed()) {
			String attribValue = driver.findElement(By.xpath("//div[@role='button' and @data-testid=\"LoginForm_Login_Button\"]")).getAttribute("aria-disabled");
			assertEquals(attribValue,"true");
		}
	}
	
	
	@When("User enters incorrect user name")
	public void user_enters_incorrect_user_name() {
		String getRandomString = RandomStringUtils.randomAlphanumeric(8);
		driver.findElement(By.xpath("//input[@name=\"session[username_or_email]\"]")).sendKeys(getRandomString);
	}

	@When("User enters incorrect Password")
	public void user_enters_incorrect_Password() {
		String getRandomString = RandomStringUtils.randomAlphanumeric(8);
		driver.findElement(By.xpath("//input[@name=\"session[password]\"]")).sendKeys(getRandomString);
	}
	
	@When("User clicks on login button")
	public void user_clicks_on_login_button() {
		driver.findElement(By.xpath("//span/span[contains(text(),'Log')]")).click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Then("Invalid username or password message should be displayed")
	public void invalid_username_or_password_message_should_be_displayed() {
	    boolean isErrMsgDisplayed = driver.findElement(By.xpath("//*[contains(text(),'The username and password you entered did not match our records. Please double-check and try again.')]")).isDisplayed();
	    assertEquals(isErrMsgDisplayed,true);
	}
	
	@When("User enters valid user name")
	public void user_enters_valid_user_name() {
		driver.findElement(By.xpath("//input[@name=\"session[username_or_email]\"]")).sendKeys("deepakpunde1");
	}

	@When("User enters valid Password")
	public void user_enters_valid_Password() {
		driver.findElement(By.xpath("//input[@name=\"session[password]\"]")).sendKeys("Welcome@1");
	}

	@Then("User is redirected to Home page")
	public void user_is_redirected_to_Home_page() {
		boolean isHomePageDisplayed = driver.findElement(By.xpath("//div/span[contains(text(),'@deepakpunde1')]")).isDisplayed();
		assertEquals(isHomePageDisplayed,true);
		objCommonSteps.logout();
	}
	


}
