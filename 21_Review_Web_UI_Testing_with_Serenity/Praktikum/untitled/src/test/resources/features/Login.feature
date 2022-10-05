Feature: Login
  As a user
  I want to login
  So I can access my dashboard

  Scenario: Login with valid userName and Password
    Given I click login button on book store
    When I input valid userName
    And I input valid password
    And I click Login button
    Then I will see Book Store Button

  Scenario: Login with valid username and invalid password
    Given I click login button on book store
    When I input valid userName
    And I input invalid password
    And I click Login button
    Then I will get error message

  Scenario: Login with invalid username and invalid password
    Given I click login button on book store
    When I input invalid userName
    And I input invalid password
    And I click Login button
    Then I will get error message

  Scenario: Login with invalid username and valid password
    Given I click login button on book store
    When I input invalid userName
    And I input valid password
    And I click Login button
    Then I will get error message