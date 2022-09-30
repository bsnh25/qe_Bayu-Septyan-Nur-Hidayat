Feature: Generate Token Account
  As a user
  I want to make token
  So I can access any features

  Scenario: Generate token with valid username and password
    Given I set url
    And valid username and password
    When I request post
    Then I will get 200
    And get information of the token

  Scenario: Generate token with valid username and invalid password
    Given I set url
    And valid username and invalid password
    When I request post token
    Then I will get 200
    And get status failed

  Scenario: Generate token with invalid username and password
    Given I set url
    And invalid username and password
    When I request post that
    Then I will get 400
    And get message falied
