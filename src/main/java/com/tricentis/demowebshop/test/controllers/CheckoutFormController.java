package com.tricentis.demowebshop.test.controllers;

import co.com.sofka.test.actions.WebAction;
import co.com.sofka.test.evidence.reports.Report;
import com.tricentis.demowebshop.test.models.CheckoutFormModel;
import com.tricentis.demowebshop.test.page.CheckoutFormPage;

public class CheckoutFormController {
	
	private WebAction webAction;
	private CheckoutFormModel checkoutFormModel;
	
	public void setCheckoutFormModel(CheckoutFormModel checkoutFormModel) {
		this.checkoutFormModel = checkoutFormModel;
	}
	
	public void setWebAction(WebAction webAction) {
		this.webAction = webAction;
	}
	
	public void llenarCamposCheckout(){
		try {
			CheckoutFormPage checkoutFormPage = new CheckoutFormPage(webAction.getDriver());
			webAction.selectByText(checkoutFormPage.getCountry(),checkoutFormModel.getCountry(),2,true);
			webAction.sendText(checkoutFormPage.getCity(),checkoutFormModel.getCity(),2,true);
			webAction.sendText(checkoutFormPage.getAddress(),checkoutFormModel.getAddress(),2,true);
			webAction.sendText(checkoutFormPage.getPostalCode(),checkoutFormModel.getPostalCode(),2,true);
			webAction.sendText(checkoutFormPage.getPhoneNumber(),checkoutFormModel.getPhoneNumber(),2,true);
			
			webAction.click(checkoutFormPage.getBtnContinue(), 2, true);
			webAction.click(checkoutFormPage.getBtnContinueTwo(), 2, true);
			webAction.click(checkoutFormPage.getBtnContinueThree(), 2, true);
			webAction.click(checkoutFormPage.getBtnContinueFour(), 2, true);
			webAction.click(checkoutFormPage.getBtnContinueFive(), 2, true);
			webAction.click(checkoutFormPage.getBtnContinueSix(), 2, true);
		}catch(Exception exception){
			Report.reportFailure("Ocurrio un error al intentar llenar el formulario de Contact Us", exception);
		}
	}
	
	
	public void emptyFieldsCheckout(){
		try {
			CheckoutFormPage checkoutFormPage = new CheckoutFormPage(webAction.getDriver());
			webAction.selectByText(checkoutFormPage.getCountry(),checkoutFormModel.getCountry(),2,true);
			webAction.sendText(checkoutFormPage.getCity(),checkoutFormModel.getCity(),2,true);
			webAction.sendText(checkoutFormPage.getAddress(),checkoutFormModel.getAddress(),2,true);
			webAction.sendText(checkoutFormPage.getPostalCode(),checkoutFormModel.getPostalCode(),2,true);
			webAction.click(checkoutFormPage.getBtnContinue(), 2, true);
			
		}catch(Exception exception){
			Report.reportFailure("Ocurrio un error al intentar llenar el formulario de Contact Us", exception);
		}
	}
}
