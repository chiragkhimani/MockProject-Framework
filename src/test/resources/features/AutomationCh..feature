Feature: Automation

  Scenario: Demo
    Given user open wix website
    When user enter text "Testing text"
    Then verify "Testing text" is displayed on page
