package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage {
	
	WebDriver driver;
	
	public ProductPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(css="h2.product_specifications")
	WebElement productCaptured;
	
	@FindBy(xpath="(//span[@id='bunny'])[3]")
	WebElement productColor;
	
	@FindBy(xpath="//button[@name='save_to_cart']")
	WebElement addingToCart;
	
	@FindBy(id="checkOutPopUp")
	WebElement popUp;
	
	@FindBy(xpath="//tbody/tr/td/a/h3")
	WebElement productName;
	
	@FindBy(xpath="//div[@id='productProperties']//div[@ng-show='firstImageToShow']//span[@title='RED']")
	WebElement anotherProductColor;
	
	
	public String getProductName() throws InterruptedException
	{
		Thread.sleep(4000);
		String productText = productCaptured.getText();
		return productText;
	}
	
	public void colorChoice() throws InterruptedException
	{
		Thread.sleep(4000);
		productColor.click();
	}
	
	public void anotherColorChoice()
	{
		anotherProductColor.click();
	}
	
	public void addingToCart() throws InterruptedException
	{
		Thread.sleep(2000);
		addingToCart.click();
	}
	
	public void handlePopup() throws InterruptedException
	{
		Thread.sleep(2000);
		popUp.click();
	}
	
	public String getPriceFromPopup()
	{
		return popUp.getText();
	}
	
	public String formatPriceFromPopup(String p)
	{
		String[] precoFormatado = p.split("\\$");
		String tratamentoPreco = precoFormatado[1].trim();
		tratamentoPreco = tratamentoPreco.replace(")", "");
		return tratamentoPreco;
	}
	
	public String getProductNameInCheckout()
	{
		return  productName.getText();
	}
	
	
}
