@FeatureName:contactUs

Feature: Store customer service Demo Web Shop

  Background:
  Given let the customer enter the demo web shop page and click on the Contact Us field

  @ScenarioName:contactUs
  Scenario: 01 - As a user I want to contact customer service
    When I fill out the form correctly
    Then I wil receive a message your inquiry has been successfully sent to the store owner.

  Scenario: 02 - As a user I want to contact customer service
    When I Fill in the Contact us form and leave the email field empty
    Then I will receive a message Enter email