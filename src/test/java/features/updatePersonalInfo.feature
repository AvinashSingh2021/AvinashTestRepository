Feature: Update Personal Info Feature

  Scenario Outline: TC02: Update Personal Information First Name in My account 
    Given I launch the application url
    When I click on Signin button
    Then I enter credentials with "<email>" and "<password>"
    When I select my personal information option
    And I change my first name and provide password
    And I select save option
    Then I should see personal information is successfully updated
      Examples:
      | email          				 | password  |
      | avisingh09ec@gmail.com | Avi@mar20 |