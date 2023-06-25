package pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Utils.Utils;


public class LandingPage {
	private WebDriver driver;
	private Utils utils = new Utils();
	public LandingPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css="loader")
	WebElement loader;
	
	@FindBy(xpath="//nav//a[text()='SPECIAL OFFER']")
	WebElement specialOffer;
	
	@FindBy(xpath="//div[@id='div-special-offer']//button")
	WebElement addToCart;
	
	@FindBy(id="menuSearch")
	WebElement search;
	
	@FindBy(xpath="//input[@id='autoComplete']")
	WebElement searchField;
	
	@FindBy(css="a.product")
	WebElement resultSearch;
	
	@FindBy(id="shoppingCartLink")
	WebElement shopLink;
	
	public void waitForLoaderDisappear() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		wait.until(ExpectedConditions.invisibilityOf(loader));
	}
	
	public void goToHomePage() {
		driver.get("https://advantageonlineshopping.com/#/");
		waitForLoaderDisappear();
	}
	
	
	public void goToOffer()
	{
		utils.waitForElementToApper(driver, 20);
		specialOffer.click();
		
		
	}
	
	
	
	public void addToCartHomePage() {
		utils.waitForElementToApper(driver, 10);
		addToCart.click();
	}
	
	public void clickSearch()
	{
		search.click();
		
	}
	
	public void sendTextForSearch(String text)
	{
		utils.waitForElementToApper(driver, 10);
		searchField.sendKeys(text);
		
	}
	
	public void addToCartTheResultSearch()
	{
		utils.waitForElementToApper(driver, 15);
		resultSearch.click();
	}
	
	public void goToShopping()
	{
		shopLink.click();
	}
}
