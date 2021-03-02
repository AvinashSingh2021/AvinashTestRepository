Feature: Purchase T-shirt

  Scenario Outline: TC01 : Order T-Shirt
    Given I launch the application url
    When I click on Signin button
    Then I enter credentials with "<email>" and "<password>"
    And I click on tshirt option
    And I add tshirt to add to cart
    And I select to proceed checkout on summary page
    And I agree terms and condition
    And I select PaybyChequeWire option
    And I confirm order
    Then I should be on order confirmation page
    When I click on Back to Orders
    Then I should see order history
     Examples:
      | email          				 | password  |
      | avisingh09ec@gmail.com | Avi@mar20 |