Feature: Login page of the application
  Scenario: Validating the login functionality
    Given user should be in the login page
    When the user enters the valid credenatils "Admin" and "admin123"
    And needs to click on the login button
    Then the user should be get into the application pages