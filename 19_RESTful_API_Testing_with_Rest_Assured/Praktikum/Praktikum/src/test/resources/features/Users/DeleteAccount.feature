Feature: Delete Account with User ID
  As a user
  I want to delete account with UserID
  So I can delete account

  Scenario: Delete account with invalid user id
    Given I set url and invalid user id
    When I request delete
    Then I will get 401
    And get Error Unauthorized message