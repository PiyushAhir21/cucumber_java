Feature: Feature to test the login functionality

  Scenario: VTiger - crm application login steps
  
    Given Browser is opened
    When User enters un and pwd
    And click on loginBtn
    Then user should be redirected to HP