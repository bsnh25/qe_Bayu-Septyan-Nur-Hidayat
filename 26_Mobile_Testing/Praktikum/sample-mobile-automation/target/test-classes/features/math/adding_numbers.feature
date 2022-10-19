Feature: Calculator

  Scenario: Adding two numbers
    Given i on calculator page
    When i click 1
    And i click +
    And i click 2
    And I click equal
    Then total is 3

  Scenario: Minus two number
    Given i on calculator page
    When i click 1
    And i click -
    And i click 2
    And I click equal
    Then total is -1

  Scenario: Div two number
    Given i on calculator page
    When i click 1
    And i click :
    And i click 2
    And I click equal
    Then total is 0.5

  Scenario: Time two number
    Given i on calculator page
    When i click 1
    And i click x
    And i click 2
    And I click equal
    Then total is 2
