package com.tricentis.demowebshop.test.controllers;

import co.com.sofka.test.actions.WebAction;
import co.com.sofka.test.evidence.reports.Report;
import com.tricentis.demowebshop.test.page.MessageContactUsPage;

public class ShoppingUnsuccessfullController {
	
	private WebAction webAction;
	private String validateMessagePhone;
	
	public void setWebAction(WebAction webAction) {
		this.webAction = webAction;
	}
	
	public String MessagePhoneRequired() {
		try {
			validateMessagePhone = "";
			MessageContactUsPage messageContactUsPage = new MessageContactUsPage(webAction.getDriver());
			validateMessagePhone = webAction.getText(messageContactUsPage.getMessagePhoneRequired(), 2, true);
		} catch (Exception exception) {
			Report.reportFailure("Ocurrio un error al intentar llenar el formulario de Contact Us", exception);
		}
		return validateMessagePhone;
	}
	
}
