Feature: Delete a user

  Scenario: Delete an existing user
    Given I am on the Admin page
    When I search for the newly added user
    And I delete the user
    Then the number of records should decrease by 1
