Feature: feature to test login functionality

  Scenario: check login is successfull with valid credentials
    Given browser is open
    And user is on login page
    When user enters username and password
    And user clciks on login button
    Then user is navigated to home page
