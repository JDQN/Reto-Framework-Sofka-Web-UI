@FeatureName:makeAPurchase.
  Feature:As a user of the demo web shop application
          I need to register to be able to make a purchase.

  Background:
    Given that the customer navigated to the home page


@ScenarioName:makeASuccessfulShopping.
  Scenario: 03 - make a successful purchase.
    When the customer fills out the form correctly making a successful shopping
    Then As a result, the user receives a successful purchase confirmation message.

    @ESENARIO02
@ScenarioName:makeAUnsuccessfulShopping.
  Scenario: 04 - make a unsuccessful purchase.
    When The client leaves the telephone number field empty in the Checkout form
    Then As a result, the user receives a Phone is required message.

