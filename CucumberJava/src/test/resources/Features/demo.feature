@SmokeFeature
Feature: feature to test login functionality

  @SmokeTest
  Scenario: Check login is successfully with valid credentials
    Given user is on login page
    When user enters username and password
    And clicks on login button
    Then user is navigated to the home page

  @SmokeTest
  Scenario: Check signin is successfully with valid credentials
    Given user is on signin page
    When user enters un and pwd
    And clicks on signin button
    Then user is navigated to the Hm page
