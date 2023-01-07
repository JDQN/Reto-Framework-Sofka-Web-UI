package com.tricentis.demowebshop.test.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppingBookPage {
	
	
	/*Localizador click a Books*/
	@CacheLookup
	@FindBy(xpath = "//body/div[4]/div[1]/div[2]/ul[1]/li[1]/a[1]")
	private WebElement buttonBook;
	
	/*Localizador click a add to cart*/
	@CacheLookup
	@FindBy(xpath = "//body/div[4]/div[1]/div[4]/div[2]/div[2]/div[2]/div[3]/div[1]/div[1]/div[2]/div[3]/div[2]/input[1]")
	private WebElement buttonAddToCart;
	
	/*Localizador click a la X del mensage*/
	@CacheLookup
	@FindBy(xpath = "//body/div[@id='bar-notification']/span[1]")
	private WebElement buttonCerrar;
	
	/*Localizador click a Shopping cart*/
	@CacheLookup
	@FindBy(xpath = "//span[contains(text(),'Shopping cart')]")
	private WebElement buttonShoppingCart;
	
	
	
	/*Localizador click a Checkbox*/
	@CacheLookup
	@FindBy(xpath = "//input[@id='termsofservice']")
	private WebElement buttonCheckbox;
	
	/*Localizador click a Checkout*/
	@CacheLookup
	@FindBy(id = "checkout")
	private WebElement buttonCheckout;
	
	
	public WebElement getButtonBook(){
		return buttonBook;
	}
	public WebElement getButtonAddToCart(){
		return buttonAddToCart;
	}
	public WebElement getButtonCerrar(){
		return buttonCerrar;
	}
	public WebElement getButtonShoppingCart(){
		return buttonShoppingCart;
	}
	public WebElement getButtonCheckbox(){
		return buttonCheckbox;
	}
	public WebElement getButtonCheckout(){
		return buttonCheckout;
	}
	
	
	
	public ShoppingBookPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
}
