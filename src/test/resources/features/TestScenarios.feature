Feature: This feature we created to test sign up functionality

  Background: 
    Given user opens the website

  Scenario: Verify user can sign up
    When user select sign up from the drop down
    Then verify user is on sign up page
    When user fill all details
    Then verify sign up successful

  Scenario: Verify user can change of country
    When user select country to "Saudi Arabia"
    Then verify country is changed to "Saudi Arabia"
    When user click on any product
    Then verify currency for "Saudi Arabia" is displayed
