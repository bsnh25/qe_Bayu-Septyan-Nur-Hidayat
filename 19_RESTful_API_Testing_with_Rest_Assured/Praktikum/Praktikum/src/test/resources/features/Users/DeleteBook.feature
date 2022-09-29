Feature: Delete Book with User ID
  As a user
  I want to delete book with UserID
  So I can delete the book

  Scenario: Delete book with invalid user id
    Given I set url and invalid user id
    When I request delete
    Then I will get 401
    And get Error Unauthorized message