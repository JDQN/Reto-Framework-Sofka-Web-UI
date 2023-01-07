package com.tricentis.demowebshop.test.controllers;

import co.com.sofka.test.actions.WebAction;
import co.com.sofka.test.evidence.reports.Report;
import co.com.sofka.test.exceptions.WebActionsException;
import com.tricentis.demowebshop.test.models.ContacUsFormModel;
import com.tricentis.demowebshop.test.page.ContacUsFormPage;

public class ContactUsFormController {
	
	private WebAction webAction;
	private ContacUsFormModel contacUsFormModel;
	
	
	public void setContacUsFormModel(ContacUsFormModel contacUsFormModel) {
		this.contacUsFormModel = contacUsFormModel;
	}
	
	public void setWebAction(WebAction webAction) {
		this.webAction = webAction;
	}
	
	public void llenarCamposContacUs() {
		try {
			ContacUsFormPage contacUsFormPage = new ContacUsFormPage(webAction.getDriver());
			webAction.sendText(contacUsFormPage.getFirstName(), contacUsFormModel.getFirstName(), 2, true);
			webAction.sendText(contacUsFormPage.getEmail(), contacUsFormModel.getEmail(), 2, true);
			webAction.sendText(contacUsFormPage.getEnquiry(), contacUsFormModel.getEnquiry(), 2, true);
			webAction.click(contacUsFormPage.getSendButton(), 2, true);
		} catch (Exception exception) {
			Report.reportFailure("Ocurrio un error al intentar llenar el formulario de Contact Us", exception);
		}
	}
	
	public void emptyFields() {
		try {
			ContacUsFormPage contacUsFormPage = new ContacUsFormPage(webAction.getDriver());
			webAction.sendText(contacUsFormPage.getFirstName(), contacUsFormModel.getFirstName(), 2, true);
			webAction.sendText(contacUsFormPage.getEnquiry(), contacUsFormModel.getEnquiry(), 2, true);
			webAction.click(contacUsFormPage.getSendButton(), 2, true);
		} catch (WebActionsException e) {
			Report.reportFailure("Ocurrio un error al intentar llenar el formulario de Contact Us", e);
		}
	}
	
}
