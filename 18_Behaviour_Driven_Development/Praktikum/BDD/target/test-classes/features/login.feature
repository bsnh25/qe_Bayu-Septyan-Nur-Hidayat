Feature: Login
  As a user
  I want to login
  So that I can access my homepage

  Scenario: Success login
    Given I go to login page
    When I input valid username and valid password
    And click login button
    Then I go to homepage

  Scenario: Failed login
    Given I go to login page
    When I input null username and valid password
    And click login button
    Then I will get error message