package com.tricentis.demowebshop.test.controllers;

import co.com.sofka.test.actions.WebAction;
import co.com.sofka.test.evidence.reports.Assert;
import co.com.sofka.test.evidence.reports.Report;
import com.tricentis.demowebshop.test.page.MessageContactUsPage;

public class MessageContactController {
	
	private WebAction webAction;
	
	private String validateMessage;
	
	public void setWebAction(WebAction webAction) {
		this.webAction = webAction;
	}
	
	public String MessageContactUs() {
		try {
			validateMessage = "";
			MessageContactUsPage messageContactUsPage = new MessageContactUsPage(webAction.getDriver());
			validateMessage = webAction.getText(messageContactUsPage.getMessageContact(), 2, true);
		} catch (Exception exception) {
			Report.reportFailure("Ocurrio un error al intentar llenar el formulario de Contact Us", exception);
		}
		return validateMessage;
	}
	
	public String MessageEnterEmail() {
		try {
			validateMessage = "";
			MessageContactUsPage messageContactUsPage = new MessageContactUsPage(webAction.getDriver());
			validateMessage = webAction.getText(messageContactUsPage.getMessageEnterEmail(), 2, true);
		} catch (Exception exception) {
			Report.reportFailure("Ocurrio un error al intentar llenar el formulario de Contact Us", exception);
		}
		return validateMessage;
	}
}
