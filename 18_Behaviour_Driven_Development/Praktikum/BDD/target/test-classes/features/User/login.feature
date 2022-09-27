Feature: Login
  As a user
  I want to login in Linkedin
  So I can access a features in LinkedIn

  Scenario: Can Login
    Given I go to login page
    When I input valid email or phone
    And I input valid password
    And I click Login button
    Then I go to home page

  Scenario: Failed Login (invalid email or phone and password)
    Given I go to login page
    When I input invalid email or phone
    And I input invalid password
    And I click Login button
    Then I go to home page

  Scenario: Failed Login (invalid password)
    Given I go to login page
    When I input valid email or phone
    And I input invalid password
    And I click Login button
    Then I go to home page

  Scenario: Failed Login (invalid email or phone)
    Given I go to login page
    When I input invalid email or phone
    And I input valid password
    And I click Login button
    Then I go to home page