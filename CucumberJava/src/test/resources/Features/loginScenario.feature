Feature: Login to Vtiger-E2 crm

  Scenario: Login functionality in vtiger - crm E2
    Given user should be at localhost8888
    When user enters un and pwd in vtiger
    And click on loginBtn element
    Then home page should be displayed successfully