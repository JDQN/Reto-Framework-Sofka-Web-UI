package com.tricentis.demowebshop.test.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContacUsFormPage {
	
	
	/*Localizadores Form Contact Us*/
	@CacheLookup
	@FindBy(id = "FullName")
	private WebElement firstName;
	
	@CacheLookup
	@FindBy(id = "Email")
	private WebElement email;
	
	@CacheLookup
	@FindBy(id = "Enquiry")
	private WebElement enquiry;
	@CacheLookup
	@FindBy(name = "send-email")
	WebElement sendButton;
	
	
	
	public WebElement getFirstName(){
		return firstName;
	}
	public WebElement getEmail(){
		return email;
	}
	public WebElement getEnquiry(){
		return enquiry;
	}
	public WebElement getSendButton(){
		return sendButton;
	}
	
	
	public ContacUsFormPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
}
