Feature: Search
  As a user
  I want to search job
  So I can get specific result

  Scenario: Search by jobs
    Given I go to login page
    When I click search menu
    And I write specific jobs
    Then I get result by the spesific jobs

  Scenario: Search by a persons
    Given I go to login page
    When I click search menu
    And I write specific persons
    Then I get result by the spesific persons

  Scenario: Search by a company
    Given I go to login page
    When I click search menu
    And I write specific company
    Then I get result by the spesific company