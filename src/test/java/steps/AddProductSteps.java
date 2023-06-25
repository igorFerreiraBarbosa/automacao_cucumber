package steps;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import dao.ProductDao;
import io.cucumber.java.After;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import model.ProductModel;
import pages.LandingPage;
import pages.OrderPage;
import pages.ProductPage;

public class AddProductSteps {
	
	
	
	private WebDriver driver = new ChromeDriver();
	private LandingPage landingPage = new LandingPage(driver);
	private ProductPage productPage = new ProductPage(driver);
	private OrderPage orderPage = new OrderPage(driver);
	private ProductDao productDao = new ProductDao();
	
	@After
	public void tearDown()
	{
		driver.quit();
	}
	
	@Dado("que estou na home page")
	public void que_estou_na_home_page() {
	    // Write code here that turns the phrase above into concrete actions
		driver.get("https://advantageonlineshopping.com/#/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@Dado("que clico na opcao Special Offer")
	public void que_clico_na_opcao_special_offer() {
	    // Write code here that turns the phrase above into concrete actions
	    landingPage.goToOffer();
	}

	@Quando("clico no botao See offer")
	public void clico_no_botao_see_offer() {
	    // Write code here that turns the phrase above into concrete actions
	    landingPage.addToCartHomePage();
	}

	@Entao("sera mostrada as especificacoes do produto")
	public void sera_mostrada_as_especificacoes_do_produto() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		for(ProductModel p: productDao.listar()) {
			Assert.assertEquals(p.getCustomization(), orderPage.getCustomization());
			Assert.assertEquals(p.getDisplay(), orderPage.getDisplay());
			Assert.assertEquals(p.getDisplayResolution(), orderPage.getDisplayResolution());
			Assert.assertEquals(p.getDisplaySize(), orderPage.getDisplaySize());
			Assert.assertEquals(p.getProductMemory(), orderPage.getMemory());
			Assert.assertEquals(p.getOperatingSystem(), orderPage.getOperatingSystem());
			Assert.assertEquals(p.getProcessor(), orderPage.getProcessor());
			Assert.assertEquals(p.getTouchscreen(), orderPage.getTouchScreen());
			Assert.assertEquals(p.getWeight(), orderPage.getWeight());
			
		}
	}

	
	@Entao("o produto sera adicionado ao carrinho com a cor selacionada")
	public void o_produto_sera_adicionado_ao_carrinho_com_a_cor_selacionada() throws InterruptedException {
	    // Write code here that tproductPage.getProductName()urns the phrase above into concrete actions
	    productPage.colorChoice();
	    productPage.addingToCart();
	}

	@Dado("que pesquiso o produto pelo ícone de lupa")
	public void que_pesquiso_o_produto_pelo_ícone_de_lupa() throws InterruptedException {
	    landingPage.clickSearch();
	    landingPage.sendTextForSearch("HP PAVILION 15Z TOUCH LAPTOP");
	}

	@Dado("seleciono o produto pesquisado")
	public void seleciono_o_produto_pesquisado() {
	    landingPage.addToCartTheResultSearch();
	}

	@Dado("altero a cor do produto")
	public void altero_a_cor_do_produto() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    productPage.anotherColorChoice();
	    productDao.updateColor();
	}

	@Dado("altero a quantidade de produtos que desejo comprar")
	public void altero_a_quantidade_de_produtos_que_desejo_comprar() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	    productPage.addingToCart();
	}

	@Dado("clico no botao Add to cart")
	public void clico_no_botao_add_to_cart() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	    productPage.addingToCart();
	}

	@Quando("acesso a pagina de checkout")
	public void acesso_a_pagina_de_checkout() throws InterruptedException {
	    productPage.handlePopup();
	}

	@Entao("a soma dos precos sera igual na pagina de checkout")
	public void a_soma_dos_precos_sera_igual_na_pagina_de_checkout() {
	    orderPage.getPriceFromOrderPage();
	   
	}

	@Dado("clico no carrinho de compras")
	public void clico_no_carrinho_de_compras() {
	    orderPage.goToShoppingCart();
	}

	@Quando("removo o produto do carrinho de compras")
	public void removo_o_produto_do_carrinho_de_compras() {
	    orderPage.removeProductFromShoppingCart();
	}

	@Entao("o carrinho de compras ficara vazio")
	public void o_carrinho_de_compras_ficara_vazio() {
	    orderPage.seeEmptyCart();
	}
}
