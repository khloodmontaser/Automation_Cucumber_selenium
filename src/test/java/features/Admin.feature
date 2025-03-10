Feature: Admin Page Functionality

  Scenario: Navigate to Admin Page and get the number of records
    Given I am logged into the OrangeHRM system
    When I click on the Admin tab
    Then I should see the number of records displayed
