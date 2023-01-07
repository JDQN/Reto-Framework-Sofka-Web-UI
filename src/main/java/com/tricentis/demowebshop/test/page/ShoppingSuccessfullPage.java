package com.tricentis.demowebshop.test.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppingSuccessfullPage {
	
	
	//Localizador de Mensage Your order has been successfully processed!
	@CacheLookup
	@FindBy(xpath = "//strong[contains(text(),'Your order has been successfully processed!')]")
	private WebElement messageOrderSuccessfully;
	
	//Localizador de numero de orden
	@CacheLookup
	@FindBy(xpath = "/html/body/div[4]/div[1]/div[4]/div/div/div[2]/div/ul/li[1]")
	private WebElement messageOrderNumber;
	
	//Localizador click en ver detalle de la orden
	@CacheLookup
	@FindBy(xpath = "//a[contains(text(),'Click here for order details.')]")
	private WebElement clickOrderDetails;
	
	//Localizador click en PDF INVOICE
	@CacheLookup
	@FindBy(xpath = "//a[contains(text(),'PDF Invoice')]")
	private WebElement clickPdfInvoice;
	
	
	public WebElement getMessageOrderSuccessfully() {
		return messageOrderSuccessfully;
	}
	
	public WebElement getMessageOrderNumber() {
		return messageOrderNumber;
	}
	
	public WebElement getClickOrderDetails() {
		return clickOrderDetails;
	}
	
	public WebElement getClickPdfInvoice() {
		return clickPdfInvoice;
	}
	
	public ShoppingSuccessfullPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
}
