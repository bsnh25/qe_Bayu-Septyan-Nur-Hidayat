Feature: Search
  As a user
  I want to search job
  So I can get specific result

  Scenario: Search by location
    Given I go to login page
    When I click search menu
    And I pick specific location
    Then I get result by the location