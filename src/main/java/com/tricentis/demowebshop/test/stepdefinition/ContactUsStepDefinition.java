package com.tricentis.demowebshop.test.stepdefinition;

import co.com.sofka.test.actions.WebAction;
import co.com.sofka.test.evidence.reports.Assert;
import com.tricentis.demowebshop.test.controllers.ContactUsFormController;
import com.tricentis.demowebshop.test.controllers.LoginPageWebController;
import com.tricentis.demowebshop.test.controllers.MessageContactController;
import com.tricentis.demowebshop.test.controllers.openwebpage.StartBrowserWebController;
import com.tricentis.demowebshop.test.data.objects.TestInfo;
import com.tricentis.demowebshop.test.models.ContacUsFormModel;
import cucumber.api.Scenario;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.assertj.core.api.Assertions;

import static co.com.sofka.test.evidence.logs.Log.LOGGER;
import static com.tricentis.demowebshop.test.helpers.Dictionary.*;
import static com.tricentis.demowebshop.test.helpers.Helper.generateCustomer;

public class ContactUsStepDefinition extends  GeneralSetUp{
	
	private WebAction webAction;
	private ContacUsFormModel contacUsFormModel;
	
	
	@Before
	public void setUp(Scenario scenario) {
		try {
			testInfo = new TestInfo(scenario);
			webAction = new WebAction(testInfo.getFeatureName());
			webAction.setScenario(testInfo.getScenarioName());
			contacUsFormModel = generateCustomer(SPANISH_CODE_LANGUAGE, COUNTRY_CODE, EMAIL_DOMAIN);
		}catch (Exception exception){
			Assertions.fail(exception.getMessage(), exception);
			LOGGER.error(exception.getMessage(), exception);
		}
		
	}
	
	/* Esenario 01 - 02*/
	@Given("let the customer enter the demo web shop page and click on the Contact Us field")
	public void letTheCustomerEnterTheDemoWebShopPageAndClickOnTheContactUsField() {
		try {
			StartBrowserWebController startBrowserWebController = new StartBrowserWebController();
			startBrowserWebController.setBrowser(browser());
			startBrowserWebController.setWebAction(webAction);
			startBrowserWebController.setFeature(testInfo.getFeatureName());
			startBrowserWebController.abrirTiendaOnline();
			
			LoginPageWebController loginPageWebController = new LoginPageWebController();
			loginPageWebController.setWebAction(webAction);
			loginPageWebController.irHaciaContactUs();
			
		}catch (Exception exception){
			Assertions.fail(exception.getMessage(), exception);
			LOGGER.error(exception.getMessage(), exception);
		}
	}
	
	/* Esenario 01 */
	@When("I fill out the form correctly")
	public void iFillOutTheFormCorrectly() {
		try{
			ContactUsFormController contactUsFormController = new ContactUsFormController();
			contactUsFormController.setContacUsFormModel(contacUsFormModel);
			contactUsFormController.setWebAction(webAction);
			contactUsFormController.llenarCamposContacUs();
		}catch (Exception exception){
			Assertions.fail(exception.getMessage(), exception);
			LOGGER.error(exception.getMessage(), exception);
		}
	}
	
	@Then("I wil receive a message your inquiry has been successfully sent to the store owner.")
	public void iWilReceiveAMessageYourInquiryHasBeenSuccessfullySentToTheStoreOwner() {
		try {
			MessageContactController messageContactController = new MessageContactController();
			messageContactController.setWebAction(webAction);
			Assert.Hard.thatString(messageContactController.MessageContactUs()).isEqualTo("Your enquiry has been successfully sent to the store owner.");
		}catch (Exception exception){
			Assertions.fail(exception.getMessage(), exception);
			LOGGER.error(exception.getMessage(), exception);
		}
	}
	
	
	/* Esenario 02 */
	@When("I Fill in the Contact us form and leave the email field empty")
	public void iFillInTheContactUsFormAndLeaveTheEmailFieldEmpty() {
		try{
			ContactUsFormController contactUsFormController = new ContactUsFormController();
			contactUsFormController.setContacUsFormModel(contacUsFormModel);
			contactUsFormController.setWebAction(webAction);
			contactUsFormController.emptyFields();
		}catch (Exception exception){
			Assertions.fail(exception.getMessage(), exception);
			LOGGER.error(exception.getMessage(), exception);
		}
	}
	
	@Then("I will receive a message Enter email")
	public void iWillReceiveAMessageEnterEmail() {
		try {
			MessageContactController messageContactController = new MessageContactController();
			messageContactController.setWebAction(webAction);
			Assert.Hard.thatString(messageContactController.MessageEnterEmail()).isEqualTo("Enter email");
		}catch (Exception exception){
			Assertions.fail(exception.getMessage(), exception);
			LOGGER.error(exception.getMessage(), exception);
		}
	}
	
}
