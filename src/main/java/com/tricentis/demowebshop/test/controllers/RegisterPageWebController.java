package com.tricentis.demowebshop.test.controllers;

import co.com.sofka.test.actions.WebAction;
import co.com.sofka.test.evidence.reports.Report;
import co.com.sofka.test.exceptions.WebActionsException;
import com.tricentis.demowebshop.test.models.RegisterUserModel;
import com.tricentis.demowebshop.test.page.RegisterPage;

public class RegisterPageWebController {
	private WebAction webAction;
	private RegisterUserModel registerUserModel;
	
	
	public void setRegisterUserModel(RegisterUserModel registerUserModel) {
		this.registerUserModel = registerUserModel;
	}
	
	public void setWebAction(WebAction webAction){
		this.webAction = webAction;
	}
	
	public void llenarCamposDeRegistro(){
		try{
			RegisterPage registerPagePage = new RegisterPage(webAction.getDriver());
			webAction.click(registerPagePage.getGenderMale(),true);
			webAction.sendText(registerPagePage.getFirstName(),registerUserModel.getFirstName(),2,true);
			webAction.sendText(registerPagePage.getLastName(),registerUserModel.getLastName(),2,true);
			webAction.sendText(registerPagePage.getEmail(),registerUserModel.getEmail(),2,true);
			webAction.sendText(registerPagePage.getPassword(),registerUserModel.getPassword(),2,true);
			webAction.sendText(registerPagePage.getConfirmPassword(),registerUserModel.getPassword(),2,true);
			webAction.click(registerPagePage.getRegisterButton(),2,true);
		}catch (WebActionsException e){
			Report.reportFailure("Ocurrio un error al intentar crear la cuenta",e);
		}
	}
}
