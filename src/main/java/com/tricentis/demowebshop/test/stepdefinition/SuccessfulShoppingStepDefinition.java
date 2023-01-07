package com.tricentis.demowebshop.test.stepdefinition;

import co.com.sofka.test.actions.WebAction;
import com.tricentis.demowebshop.test.controllers.LoginPageWebController;
import com.tricentis.demowebshop.test.controllers.RegisterPageWebController;
import com.tricentis.demowebshop.test.controllers.SuccessfulShoppingController;
import com.tricentis.demowebshop.test.controllers.openwebpage.StartBrowserWebController;
import com.tricentis.demowebshop.test.data.objects.TestInfo;
import com.tricentis.demowebshop.test.models.RegisterUserModel;
import cucumber.api.Scenario;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.assertj.core.api.Assertions;

import static co.com.sofka.test.evidence.logs.Log.LOGGER;
import static com.tricentis.demowebshop.test.helpers.Dictionary.*;
import static com.tricentis.demowebshop.test.helpers.Helper.generateRegisterUserModel;

public class SuccessfulShoppingStepDefinition extends GeneralSetUp{
	
	private WebAction webAction;
	private RegisterUserModel registerUserModel;
	
	
	@Before
	public void setUp(Scenario scenario) {
		try {
			testInfo = new TestInfo(scenario);
			webAction = new WebAction(testInfo.getFeatureName());
			webAction.setScenario(testInfo.getScenarioName());
			registerUserModel = generateRegisterUserModel(SPANISH_CODE_LANGUAGE, COUNTRY_CODE, EMAIL_DOMAIN);
		}catch (Exception exception){
			Assertions.fail(exception.getMessage(), exception);
			LOGGER.error(exception.getMessage(), exception);
		}
	}
	
	
	@Given("that the customer navigated to the home page")
	public void thatTheCustomerNavigatedToTheHomePage() {
		try {
			StartBrowserWebController startBrowserWebController = new StartBrowserWebController();
			startBrowserWebController.setBrowser(browser());
			startBrowserWebController.setWebAction(webAction);
			startBrowserWebController.setFeature(testInfo.getFeatureName());
			startBrowserWebController.abrirTiendaOnline();
		}catch (Exception exception){
			Assertions.fail(exception.getMessage(), exception);
			LOGGER.error(exception.getMessage(), exception);
		}
	}
	
	@When("the customer fills out the form correctly making a successful shopping")
	public void theCustomerFillsOutTheFormCorrectlyMakingASuccessfulShopping() {
		try {
			LoginPageWebController loginPageWebController = new LoginPageWebController();
			loginPageWebController.setWebAction(webAction);
			loginPageWebController.irHaciaRegisterPage();
			
			RegisterPageWebController registerPageWebController = new RegisterPageWebController();
			registerPageWebController.setRegisterUserModel(registerUserModel);
			registerPageWebController.setWebAction(webAction);
			registerPageWebController.llenarCamposDeRegistro();
			
			SuccessfulShoppingController successfulShoppingController = new SuccessfulShoppingController();
			successfulShoppingController.setWebAction(webAction);
			successfulShoppingController.irHaciaBooks();
			
		}catch (Exception exception){
			Assertions.fail(exception.getMessage(), exception);
			LOGGER.error(exception.getMessage(),exception);
		}
	}
	
	@Then("As a result, the user receives a successful purchase confirmation message.")
	public void asAResultTheUserReceivesASuccessfulPurchaseConfirmationMessage() {
	
	}
	
}
