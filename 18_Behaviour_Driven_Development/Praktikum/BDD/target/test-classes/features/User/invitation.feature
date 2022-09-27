Feature: Invite
  As a user
  I want to connect to another persons
  So I can connect with any persons

  Scenario: Request connect to any persons
    Given I go to login page
    When I click my network
    And I click connect to persons
    Then I get result waiting

  Scenario: Accept a request from any persons
    Given I go to login page
    When I click my network
    And I click pending invitations
    And I accept a request with click checklist button
    Then I get connect with that persons