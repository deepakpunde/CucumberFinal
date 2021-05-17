package steps;

import static org.junit.Assert.assertEquals;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import elements.TwitterLoginElements;
import elements.TwitterProfileElements;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TwitterTweetAnalysisSteps {
	//Variable declaration
	WebDriver driver;
	WebDriverWait webdriverwait;
	TwitterLoginElements objTwitter_Home_Elements;
	TwitterProfileElements objTwitterProfileElements;

	CommonSteps objCommonSteps;

	String strBio = "Selenium Automation user";
	String strLocation = "Pune";
	String strWebSite = "in.yahoo.com";
	
	//Constructor
	public TwitterTweetAnalysisSteps(CommonSteps objCommonSteps) {
		this.driver = objCommonSteps.getDriver();
		webdriverwait = new WebDriverWait(driver, 30);
		objTwitter_Home_Elements = new TwitterLoginElements(driver);
		objTwitterProfileElements = new TwitterProfileElements(driver);
		this.objCommonSteps = objCommonSteps;
	}
	
	@Given("User is on the Twitter Home page1")
	public void user_is_on_the_Twitter_Home_page1() {
		driver.get("https://twitter.com/login");
		webdriverwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='session[username_or_email]']")));
		driver.findElement(By.xpath("//input[@name='session[username_or_email]']")).sendKeys("deepakpunde1");
		driver.findElement(By.xpath("//input[@name='session[password]']")).sendKeys("P@ssw0rd");
		driver.findElement(By.xpath("//span/span[contains(text(),'Log')]")).click();
		webdriverwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div/span[contains(text(),'@deepakpunde1')]")));
		boolean isHomePageDisplayed = driver.findElement(By.xpath("//div/span[contains(text(),'@deepakpunde1')]")).isDisplayed();
		assertEquals(isHomePageDisplayed, true);
	}

	@When("User searches twitter account")
	public void user_searches_twitter_account() {
		// Enter search criteria and hit enter 
		WebElement eleSearchTextField = driver.findElement(By.xpath("//input[@aria-label='Search query']"));
		eleSearchTextField.sendKeys("times of india");
		eleSearchTextField.sendKeys(Keys.RETURN);
	}

	@Then("User can search tweets for account since last {int} hours")
	public void user_can_search_tweets_for_account_since_last_hours(Integer int1) throws ParseException {
		int noOfPages = 0;

		//click - //span[contains(text(),'@timesofindia')]
		webdriverwait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(),'@timesofindia')]")));
		driver.findElement(By.xpath("//span[contains(text(),'@timesofindia')]")).click();
		
		webdriverwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[normalize-space(.) = '© 2021 Twitter, Inc.']")));
	
		//Get the timestamp from which to find tweets
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

		// Create a calendar object with today date. Calendar is in java.util pakage.
		Calendar calendar = Calendar.getInstance();

		// Move calendar to backwards
		calendar.add(Calendar.MINUTE, -180);

		// Get current date of calendar which point to the yesterday now Date
		Date timeTwoHrBack = calendar.getTime();

		System.out.println("Past time " + dateFormat.format(timeTwoHrBack));

		//driver.findElement(By.xpath("//div[@role='presentation']/a/div/span[contains(text(),'Latest')]")).click();

		for (int i = 0; i < noOfPages; i++) {
			// Get all tweets
			List<WebElement> listOfTweets = driver.findElements(By.xpath(
					"//span[contains(text(),'The Times Of India')]/following::span[contains(text(),'@timesofindia')]/following::div[@data-testid='tweet']"));
			System.out.println("Number of tweets = " + listOfTweets.size());

			// for each list item of type tweet - get time of tweet
			for (WebElement eleTweet : listOfTweets) {
				// System.out.println(eleTweet.findElement(By.xpath("/div[2]/div[1]/div/div/div/a/time")).getAttribute("datetime"));

				System.out.println(eleTweet.findElement(By.xpath(
						"//span[contains(text(),'The Times Of India')]/following::span[contains(text(),'@timesofindia')]/following::div[@data-testid='tweet']/following::time"))
						.getAttribute("datetime"));
				String timeOfTweet = eleTweet.findElement(By.xpath(
						"//span[contains(text(),'The Times Of India')]/following::span[contains(text(),'@timesofindia')]/following::div[@data-testid='tweet']/following::time"))
						.getAttribute("datetime");

				timeOfTweet = timeOfTweet.replace("T", " ");

				timeOfTweet = timeOfTweet.replace("Z", "");

				System.out.println("Time of tweet " + timeOfTweet);

				Date TimeOfTweet = dateFormat.parse(timeOfTweet);

				if (TimeOfTweet.compareTo(timeTwoHrBack) < 0) {
					System.out.println("Date 1 occurs before Date 2");
				}
			}

			JavascriptExecutor js = ((JavascriptExecutor) driver);
			js.executeScript("window.scrollTo(0, document.body.scrollHeight)");

			System.out.println("Page scrolled " + (i + 1));
		}

		// get all tweets - Get all tweets = //div[@data-testid='tweet']
		List<WebElement> listOfTweets = driver.findElements(By.xpath("//div[@data-testid='tweet']"));
		System.out.println("Number of tweets = " + listOfTweets.size());

		// for each list item - get element - //
		// div[@data-testid='tweet']/div[2]/div[1]/div/div/div/a/time
		for (WebElement eleTweet : listOfTweets) {
			// System.out.println(eleTweet.findElement(By.xpath("/div[2]/div[1]/div/div/div/a/time")).getAttribute("datetime"));
			System.out.println(
					eleTweet.findElement(By.xpath("//div[@data-testid='tweet']/div[2]/div[1]/div/div/div/a/time"))
							.getAttribute("datetime"));

		}

	}
}

