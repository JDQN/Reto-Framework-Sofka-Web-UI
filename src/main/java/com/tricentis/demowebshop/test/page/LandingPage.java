package com.tricentis.demowebshop.test.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {
	
	@CacheLookup
	@FindBy(xpath = "//a[contains(text(),'Contact us')]")
	private WebElement contactLink;
	@CacheLookup
	@FindBy(className = "ico-register")
	WebElement register;
	
	
	public WebElement getRegister(){
		return register;
	}
	public WebElement getContactUs(){
		return contactLink;
	}
	
	
	public LandingPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
}
