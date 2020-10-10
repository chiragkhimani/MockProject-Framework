Feature: This feature we created to test sign up functionality

  @Smoke
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

  @Regression
  Scenario: validate admin cannot add user with duplicate username - FAILED
    Given user open orange hrm website
    When user login with admin access
    Then verify user is on home page
    When user select admin menu
    And select user management menu
    And click on users tab
    Then verify user is on user listing page
    When user click on Add button
    Then verify user is on add user page
    When user fills required details with duplicate user on add user page
    Then verify save button is disabled
    And verify duplicate username error message is displayed

  @Regression
  Scenario: validate error message for password mismatch
    Given user open orange hrm website
    When user login with admin access
    Then verify user is on home page
    When user select admin menu
    And select user management menu
    And click on users tab
    Then verify user is on user listing page
    When user click on Add button
    Then verify user is on add user page
    When user fills required details with password mismatch on add user page
    Then verify save button is disabled
    And verify password mismatch error message is displayed
