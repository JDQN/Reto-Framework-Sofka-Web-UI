package com.tricentis.demowebshop.test.controllers;

import co.com.sofka.test.actions.WebAction;
import co.com.sofka.test.evidence.reports.Report;
import com.tricentis.demowebshop.test.page.MessageContactUsPage;
import com.tricentis.demowebshop.test.page.ShoppingSuccessfullPage;


public class ShoppingSuccessfullController {
	
	private WebAction webAction;
	private String validateMessagePhone;
	
	
	public void setWebAction(WebAction webAction) {
		this.webAction = webAction;
	}
	
	public String getShoppingSuccessMesage(){
		String validateMessageShopping = "";
		try {
			ShoppingSuccessfullPage shoppingSuccessfullPage = new ShoppingSuccessfullPage(webAction.getDriver());
			validateMessageShopping = webAction.getText(shoppingSuccessfullPage.getMessageOrderSuccessfully(),2,true);
		}catch (Exception exception) {
			Report.reportFailure("Ocurrio un error al intentar llenar el formulario de Contact Us", exception);
		}
		return validateMessageShopping;
	}
	
	public String numberOrden() {
		String validateNumberOder = "";
		try {
			ShoppingSuccessfullPage shoppingSuccessfullPage = new ShoppingSuccessfullPage(webAction.getDriver());
			validateNumberOder = webAction.getText(shoppingSuccessfullPage.getMessageOrderNumber(), 2, true);
			validateNumberOder = validateNumberOder.replace("Order #", "");
		} catch (Exception exception) {
			Report.reportFailure("Ocurrio un error al intentar llenar el formulario de Contact Us", exception);
		}
		return validateNumberOder;
	}
	
		public String numberOrderEqual() {
			String validateNumberOderEqual = "";
			try {
				ShoppingSuccessfullPage shoppingSuccessfullPage = new ShoppingSuccessfullPage(webAction.getDriver());
				validateNumberOderEqual = webAction.getText(shoppingSuccessfullPage.getMessageOrderNumber(), 2, true);
				validateNumberOderEqual = validateNumberOderEqual.replace("", "");
				
				webAction.click(shoppingSuccessfullPage.getClickOrderDetails(),2,true);
				webAction.click(shoppingSuccessfullPage.getClickPdfInvoice(),2,true);
				
			} catch (Exception exception) {
				Report.reportFailure("Ocurrio un error al intentar llenar el formulario de Contact Us", exception);
			}
			return validateNumberOderEqual;
			
		}
		
	}
	
	
