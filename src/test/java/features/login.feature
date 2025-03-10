Feature: Login to OrangeHRM

  Scenario: Successful login with valid credentials
    Given navigate to login
    When I enter "Admin" as username
    And I enter "admin123" as password
    And I click on the login button
    Then I should be redirected to the dashboard
