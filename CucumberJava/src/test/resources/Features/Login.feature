Feature: feature of CRM Login functionality

  Scenario: 
    validate the CRM Login is working

    Given browser will be opened
    And user will be on CRM login page
    When user is entering username and password
    And clicking on login button
    Then user is navigated to HomePage of CRM