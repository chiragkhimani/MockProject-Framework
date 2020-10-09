Feature: This feature we created to test sign up functionality

  Scenario: Verify admin can create username
    Given user open orange hrm website
    When user login with admin access
    Then verify user is on home page
    When user select admin menu
    And select user management menu
    And click on users tab
    Then verify user is on user listing page
    When user click on Add button
    Then verify user is on add user page
    When user fills required details on add user page
    And click on save button
    Then verify add user success message is dispalyed
    And verify user is on user listing page
