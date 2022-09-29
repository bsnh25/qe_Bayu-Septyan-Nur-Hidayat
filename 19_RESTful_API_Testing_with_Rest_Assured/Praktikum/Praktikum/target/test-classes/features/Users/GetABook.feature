Feature: Get a information of the Book with ISBN
  As a user
  I want to get a information of the book with ISBN
  So I can know the information of that book

  Scenario: Get a title Book with valid ISBN (9781449325862)
    Given I set url and valid ISBN
    When I request get book
    Then I will get 200
    And get a infromation of the book

  Scenario: Get a Book with invalid ISBN (11)
    Given I set url and invalid ISBN
    When I request get book
    Then I will get 400
    And get not found message