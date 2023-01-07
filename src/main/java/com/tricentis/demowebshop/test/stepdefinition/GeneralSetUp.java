package com.tricentis.demowebshop.test.stepdefinition;


import co.com.sofka.test.automationtools.selenium.Browser;
import com.tricentis.demowebshop.test.data.objects.TestInfo;
import org.openqa.selenium.chrome.ChromeOptions;


public class GeneralSetUp {
	
	protected TestInfo testInfo;
	
	public Browser browser(){
		Browser browserConfiguration = new Browser();
		browserConfiguration.setBrowser(Browser.Browsers.CHROME);
		browserConfiguration.setIncognito(true);
		browserConfiguration.setMaximized(true);
		browserConfiguration.setAutoDriverDownload(true);
		browserConfiguration.setChromeOptions(chromeOptions());
		
		return browserConfiguration;
	}
	
	private ChromeOptions chromeOptions(){
		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized");
		return options;
	}
}
