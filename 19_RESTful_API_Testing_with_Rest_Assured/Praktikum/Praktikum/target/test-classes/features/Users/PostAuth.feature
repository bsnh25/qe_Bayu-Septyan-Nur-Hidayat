Feature: Authorized Account
  As a user
  I want to authorized my account
  So I can check it's true or no

  Scenario: Authorized Account with valid username and password
    Given I set url auth
    And valid username and password
    When I request post
    Then I will get 200
    And get true message

  Scenario: Authorized Account with valid username and invalid password
    Given I set url auth
    And valid username and invalid password
    When I request post auth
    Then I will get 404
    And get message not found

  Scenario: Authorized Account with invalid username and password
    Given I set url auth
    And invalid username and password
    When I request post that
    Then I will get 400
    And get message falied
