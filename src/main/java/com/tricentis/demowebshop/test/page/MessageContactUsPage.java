package com.tricentis.demowebshop.test.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MessageContactUsPage {
	
	/*Localizadores Messages Contact Us*/
	@CacheLookup
	@FindBy(xpath = "//div[contains(text(),'Your enquiry has been successfully sent to the sto')]")
	private WebElement messageContact;
	
	@CacheLookup
	@FindBy(xpath = "//body/div[4]/div[1]/div[4]/div[2]/div[1]/div[3]/form[1]/div[2]/div[1]/div[2]/span[1]")
	private WebElement messageEnterEmail;
	
	
	public WebElement getMessageContact(){
		return messageContact;
	}
	
	public WebElement getMessageEnterEmail(){
		return messageEnterEmail;
	}
	
	public MessageContactUsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
}
