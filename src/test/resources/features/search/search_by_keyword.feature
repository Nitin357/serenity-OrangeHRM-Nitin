Feature: User Login As a registered user


  Scenario: Successful Login
    Given User is on login page
    When the user enters valid username and password credentials
    And clicks the login button
    Then user should be redirected to the dashboard