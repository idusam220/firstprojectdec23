package variousConcepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CrmTest {
	WebDriver driver;
	JavascriptExecutor js;
	By USER_NAME_FIELD = By.xpath("//input[@type='text']");
    By PASSWORD_FIELD = By.xpath("//input[@type='password']");
	By SUBMIT_BUTTON = By.xpath("//button[@type='submit']");
	By DASHBOARD_HEADER_FIELD = By.xpath("//strong[text()='Dashboard']");
	By CUSTOMER_FIELD = By.xpath("//span[text()='Add Customer']");
	By ADD_CUSTOMER_FIELD = By.xpath("//span[text()='Add Customer']");
	
	
	
	
	@BeforeMethod 
	public void setUp(){
		System.setProperty("webdriver.chrome.driver","/Users/samueliduherubuntu/eclipse-workspace/testNGframwork/drivers/chromedriver");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://codefios.com/ebilling/ ");
		driver.manage().window().maximize();
		js=(JavascriptExecutor)driver;
		
	}
	@Test
	public void testLogin()  {
		
		
	}
	// @AfterMethod
	public void tearDown()  {
		
    	driver.quit();
    }
	

}
