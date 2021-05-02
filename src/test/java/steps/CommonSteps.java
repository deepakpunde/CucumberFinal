package steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class CommonSteps {
	private WebDriver driver;
	//WebDriverWait webdriverwait = new WebDriverWait(driver, 20);

	
	/*GLOBAL HOOKS - Before hook will get executed before every scenario*/
	@Before
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "webdrivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	
	/*After hook will get executed after every scenario*/
	@After
	public void tearDown() throws InterruptedException {
		driver.quit();
		Thread.sleep(5000);		
	}
	
	public WebDriver getDriver() {
		return driver;
	}
	
	public void logout() {
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		driver.findElement(By.xpath("//div[@aria-label='Account menu']")).click();
		driver.findElement(By.xpath("//a[@href='/logout']")).click();
		driver.findElement(By.xpath("//span/span[contains(text(),'out')]")).click();
	}
	
}
