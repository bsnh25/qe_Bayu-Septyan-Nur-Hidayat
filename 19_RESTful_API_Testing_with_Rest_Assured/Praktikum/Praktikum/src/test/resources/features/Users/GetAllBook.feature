Feature: Get All Book
  As a user
  I want to get all book
  So I can get information all of the book

  Scenario: Get all book
    Given I set url book
    When I request get all of book
    Then I will get 200
    And get all of the infromation of the book