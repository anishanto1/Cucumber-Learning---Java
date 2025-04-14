Feature: Login Orange HRM demo page

  Scenario: This is login scenario
    Given Go to the login page
    When Enter the below credentials
      | Username | Password  |
      | Admin    | admin123  |
    And click the login button