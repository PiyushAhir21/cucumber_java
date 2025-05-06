Feature: feature to test CRM Login functionality

  Scenario: 
    validate CRM Login is working

    Given browser is opened
    And user is on CRM login page
    When user enters username and password
    And click on login button
    Then user is navigated to Home Page