package com.tricentis.demowebshop.test.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutFormPage {
	
	
	/*Localizadores Formulario de Checkout*/
	
	//Localizador First Name
	@CacheLookup
	@FindBy(id = "BillingNewAddress_FirstName")
	private WebElement firstName;
	
	//Localizador Last Name
	@CacheLookup
	@FindBy(id = "BillingNewAddress_LastName")
	private WebElement lastName;
	
	//Localizador Email
	@CacheLookup
	@FindBy(id = "BillingNewAddress_Email")
	private WebElement email;
	
	//Localizador Company
	@CacheLookup
	@FindBy(id = "BillingNewAddress_Company")
	private WebElement company;
	
	//Localizador Country
	@CacheLookup
	@FindBy(id = "BillingNewAddress_CountryId")
	private WebElement country;
	
	//Localizador State
	@CacheLookup
	@FindBy(id = "BillingNewAddress_StateProvinceId")
	private WebElement state;
	
	//Localizador City
	@CacheLookup
	@FindBy(id = "BillingNewAddress_City")
	private WebElement city;
	
	//Localizador Address
	@CacheLookup
	@FindBy(id = "BillingNewAddress_Address1")
	private WebElement address;
	
	//Localizador postal code
	@CacheLookup
	@FindBy(id = "BillingNewAddress_ZipPostalCode")
	private WebElement postalCode;
	
	//Localizador Phone number
	@CacheLookup
	@FindBy(id = "BillingNewAddress_PhoneNumber")
	private WebElement phoneNumber;
	
	//Localizador Fax number
	@CacheLookup
	@FindBy(id = "BillingNewAddress_FaxNumber")
	private WebElement faxNumber;
	
	//Localizador Boton continue 1
	@CacheLookup
	@FindBy(xpath = "//body/div[4]/div[1]/div[4]/div[1]/div[1]/div[2]/ol[1]/li[1]/div[2]/div[1]/input[1]")
	private WebElement btnContinue;
	
	//Localizador Boton continue 2
	@CacheLookup
	@FindBy(xpath = "//body/div[4]/div[1]/div[4]/div[1]/div[1]/div[2]/ol[1]/li[2]/div[2]/div[1]/input[1]")
	private WebElement btnContinueTwo;
	
	//Localizador Boton continue 3
	@CacheLookup
	@FindBy(xpath = "//body/div[4]/div[1]/div[4]/div[1]/div[1]/div[2]/ol[1]/li[3]/div[2]/form[1]/div[2]/input[1]")
	private WebElement btnContinueThree;
	
	//Localizador Boton continue 4
	@CacheLookup
	@FindBy(xpath = "//body/div[4]/div[1]/div[4]/div[1]/div[1]/div[2]/ol[1]/li[4]/div[2]/div[1]/input[1]")
	private WebElement btnContinueFour;
	
	//Localizador Boton continue 5
	@CacheLookup
	@FindBy(xpath = "//body/div[4]/div[1]/div[4]/div[1]/div[1]/div[2]/ol[1]/li[5]/div[2]/div[1]/input[1]")
	private WebElement btnContinueFive;
	
	//Localizador Boton continue 6
	@CacheLookup
	@FindBy(xpath = "//body/div[4]/div[1]/div[4]/div[1]/div[1]/div[2]/ol[1]/li[6]/div[2]/div[2]/input[1]")
	private WebElement btnContinueSix;
	
	
	
	
	
	
	//Getter de los Localizadores
	public WebElement getFirstName() {
		return firstName;
	}
	
	public WebElement getLastName() {
		return lastName;
	}
	
	public WebElement getEmail() {
		return email;
	}
	
	public WebElement getCompany() {
		return company;
	}
	
	public WebElement getCountry() {
		return country;
	}
	
	public WebElement getState() {
		return state;
	}
	
	public WebElement getCity() {
		return city;
	}
	
	public WebElement getAddress() {
		return address;
	}
	
	public WebElement getPostalCode() {
		return postalCode;
	}
	
	public WebElement getPhoneNumber() {
		return phoneNumber;
	}
	
	public WebElement getFaxNumber() {
		return faxNumber;
	}
	
	public WebElement getBtnContinue() {
		return btnContinue;
	}
	
	public WebElement getBtnContinueTwo() {
		return btnContinueTwo;
	}
	
	public WebElement getBtnContinueThree() {
		return btnContinueThree;
	}
	
	public WebElement getBtnContinueFour() {
		return btnContinueFour;
	}
	
	public WebElement getBtnContinueFive() {
		return btnContinueFive;
	}
	
	public WebElement getBtnContinueSix() {
		return btnContinueSix;
	}
	
	
	
	public CheckoutFormPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
}
