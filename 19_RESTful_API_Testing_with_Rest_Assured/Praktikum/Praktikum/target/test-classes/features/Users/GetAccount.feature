Feature: Get Account with User ID
  As a user
  I want to Get account with UserID
  So I can get information of that account

  Scenario: Get Account with invalid User ID
    Given I set url and invalid user id
    When I request get account
    Then I will get 401
    And get Error Unauthorized message