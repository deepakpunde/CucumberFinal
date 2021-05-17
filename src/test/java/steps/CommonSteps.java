package steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import Utils.Log;
import dataProvider.ConfigFileReader;
import io.cucumber.java.Scenario;
import managers.WebDriverManager;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class CommonSteps {
	//Variable declaration
	private WebDriver driver;
	private WebDriverWait wait;
	ConfigFileReader configFileReader;
	WebDriverManager webDriverManager;

	
	/*GLOBAL HOOKS - Before hook will get executed before every scenario*/
	@Before
	public void setUp() {
		//System.setProperty("webdriver.chrome.driver", "webdrivers/chromedriver.exe");
		configFileReader = new ConfigFileReader();
		//System.setProperty("webdriver.chrome.driver", configFileReader.getDriverPath());
		//driver=new ChromeDriver();
		webDriverManager = new WebDriverManager();
		driver = webDriverManager.getDriver();
		driver.manage().window().maximize();
		wait = new WebDriverWait(driver, configFileReader.getImplicitlyWait());		
		driver.manage().timeouts().implicitlyWait(configFileReader.getImplicitlyWait(),TimeUnit.SECONDS);		
		Log.info("Sceanrio execution started -----");
	}
	
	/*GLOBAL HOOKS - After hook will get executed after every scenario*/
	@After(order=1)
	public void tearDown(Scenario scenario) throws Exception {
		if(scenario.isFailed()) {
			//Take Screenshot
			final byte[] shot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
			//Embed into Report
			scenario.embed(shot, "image/png", scenario.getName());
		}
		driver.quit();
		Thread.sleep(5000);
		Log.info("Sceanrio execution ended -------");
	}
	
	public WebDriver getDriver() {
		return driver;
	}
	
	public WebDriverWait getWait() {
		return wait;
	}
	
	public void logout() {
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		driver.findElement(By.xpath("//div[@aria-label='Account menu']")).click();
		driver.findElement(By.xpath("//a[@href='/logout']")).click();
		driver.findElement(By.xpath("//span/span[contains(text(),'out')]")).click();
	}
	
}
