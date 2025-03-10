Feature: Add new user

  Scenario: Add a new user to the system
    Given I am on the Admin page
    When I get the current number of records
    And I click on the add button
    And I fill in the required user details
    And I click on the save button
    Then the number of records should increase by 1
