Feature: Update Personal Info Feature

  Scenario: TC02: Update Personal Information First Name in My account 
    Given I launch the application url
    When I click on Signin button
    Then I enter credentials with "avisingh09ec@gmail.com" and "Avi@mar20"
  	When I click on my login name
    And I should see my account options
    And I 	select my personal information option
    Then I should be on personal information page
    When I change my first name and provide password
    And I select save option
    Then I should see personal information is successfully updated