package com.tricentis.demowebshop.test.runners;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
		snippets = SnippetType.CAMELCASE,
		features = {"src/main/resources/features/contactUs.feature"},
		glue = {"com.tricentis.demowebshop.test.stepdefinition"}
)
public class ContacUsRunnerTest {

}
