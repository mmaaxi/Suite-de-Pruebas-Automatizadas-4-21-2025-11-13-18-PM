Feature: Successful Login

  Scenario: User logs in with correct credentials
    Given the user is on the Login Page
    When the user enters a valid username and password
    And the user clicks the login button
    Then the user should be redirected to the main page