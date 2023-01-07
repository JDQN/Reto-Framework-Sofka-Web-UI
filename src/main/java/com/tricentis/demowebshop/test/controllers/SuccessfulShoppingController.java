package com.tricentis.demowebshop.test.controllers;

import co.com.sofka.test.actions.WebAction;
import co.com.sofka.test.evidence.reports.Report;
import co.com.sofka.test.exceptions.WebActionsException;
import com.tricentis.demowebshop.test.page.LandingPage;
import com.tricentis.demowebshop.test.page.ShoppingBookPage;

public class SuccessfulShoppingController {
	
	private WebAction webAction;
	
	
	public void setWebAction(WebAction webAction) {
		this.webAction = webAction;
	}
	
	
	/*Click en Books*/
	public void irHaciaBooks(){
		try{
			ShoppingBookPage shoppingBookPage = new ShoppingBookPage(webAction.getDriver());
			webAction.click(shoppingBookPage.getButtonBook(),2,true);
			webAction.click(shoppingBookPage.getButtonAddToCart(),2,true);
			webAction.click(shoppingBookPage.getButtonCerrar(),2,true);
			webAction.click(shoppingBookPage.getButtonShoppingCart(),2,true);
			webAction.click(shoppingBookPage.getButtonCheckbox(),2,true);
			webAction.click(shoppingBookPage.getButtonCheckout(),2,true);
		}catch (WebActionsException e){
			Report.reportFailure("Ocurrio un error al intentar ir a la pagina de Contact Us",e);
		}
	}
}
