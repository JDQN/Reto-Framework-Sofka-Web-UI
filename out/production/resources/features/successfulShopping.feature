@FeatureName:makeAPurchase.
  Feature:As a user of the demo web shop application
          I need to register to be able to make a purchase.


@ScenarioName:makeASuccessfulShopping.
  Scenario:make a successful purchase.
  Given that the customer navigated to the home page
  When the customer fills out the form correctly making a successful shopping
  Then As a result, the user receives a successful purchase confirmation message.

