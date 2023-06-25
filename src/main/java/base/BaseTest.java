package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import pages.LandingPage;
import pages.OrderPage;
import pages.ProductPage;

public class BaseTest {
	public WebDriver driver;
	public LandingPage landingPage;
	public OrderPage orderPage;
	public ProductPage productPage;
	
	@Before
	public void setUp() {
		driver = new ChromeDriver();
	}
	
	@After
	public void tearDown( ) {
		if(driver != null) {
			driver.quit();
		}
	}
}
