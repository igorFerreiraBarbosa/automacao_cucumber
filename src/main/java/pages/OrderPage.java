package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderPage {
	
	WebDriver driver;
	
	public OrderPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//tbody/tr/td/a/h3")
	WebElement productNameOrderPage;
	
	@FindBy(xpath="//label[text()='CUSTOMIZATION']//following-sibling::label")
	WebElement customization;
	
	@FindBy(xpath="//label[text()='DISPLAY']//following-sibling::label")
	WebElement display;
	
	@FindBy(xpath="//label[text()='DISPLAY RESOLUTION']//following-sibling::label")
	WebElement displayResolution;
	
	@FindBy(xpath="//label[text()='DISPLAY SIZE']//following-sibling::label")
	WebElement displaySize;
	
	@FindBy(xpath="//label[text()='MEMORY']//following-sibling::label")
	WebElement memory;
	
	@FindBy(xpath="//label[text()='OPERATING SYSTEM']//following-sibling::label")
	WebElement operatingSystem;
	
	@FindBy(xpath="//label[text()='PROCESSOR']//following-sibling::label")
	WebElement processor;
	
	@FindBy(xpath="//label[text()='TOUCHSCREEN']//following-sibling::label")
	WebElement touchscreen;
	
	@FindBy(xpath="//label[text()='WEIGHT']//following-sibling::label")
	WebElement weight;
	
	@FindBy(xpath="//div[@id='userCart'] //span[text()='GRAY']//following-sibling::label")
	WebElement colorInOrderPage;
	
	@FindBy(xpath="//div[@class='penetrationInCart']//label[2]//span")
	WebElement priceFromOrderPage;
	
	@FindBy(id="shoppingCartLink")
	WebElement shoppingCart;
	
	@FindBy(css="a.remove")
	WebElement removeProduct;
	
	@FindBy(css="div.emptyCart")
	WebElement emptyCart;
	
	
	public String getProductNameInOrderPage()
	{
		return productNameOrderPage.getText();
	}
	
	public String getColorInOrderPage()
	{
		return colorInOrderPage.getText();
	}
	
	public String getCustomization() {
		return customization.getText();
	}
	
	public String getDisplay() {
		return display.getText();
	}
	
	public String getDisplayResolution() {
		return displayResolution.getText();
	}
	
	public String getDisplaySize() {
		return displaySize.getText();
	}
	
	public String getMemory() {
		return memory.getText();
	}
	
	public String getOperatingSystem() {
		return operatingSystem.getText();
	}
	
	public String getProcessor() {
		return processor.getText();
	}
	
	public String getTouchScreen() {
		return touchscreen.getText();
	}
	
	public String getWeight() {
		return weight.getText();
	}
	
	public String getPriceFromOrderPage()
	{
		return priceFromOrderPage.getText();
	}
	
	public String formatPriceFromOrderPage(String p)
	{
		return p.replace("$", "");
		
	}
	
	public void goToShoppingCart() {
		shoppingCart.click();
	}
	
	
	public void removeProductFromShoppingCart() {
		removeProduct.click();
	}
	
	public void seeEmptyCart() {
		emptyCart.getText();
	}
	
}
