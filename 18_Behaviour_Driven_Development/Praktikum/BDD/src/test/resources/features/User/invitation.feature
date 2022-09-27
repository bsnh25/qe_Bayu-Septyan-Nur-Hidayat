Feature: Invite
  As a user
  I want to connect to another persons
  So I can connect with any persons

  Scenario: Connect persons
    Given I go to login page
    When I click my network
    And I click connect to persons
    Then I get result waiting
