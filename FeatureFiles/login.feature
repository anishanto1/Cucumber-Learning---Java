@simplelogin
Feature: simplelogin feature

  Scenario: Validating the login functionality
    Given user should be on the login page
    When the user enters the valid username and password
    And clicks on the login button
    Then the user should be navigated to the application pages