Feature: Login
  Background:
    Given I am the main page
    When Navigate to My Account page
    Then I should see the Login form

  Scenario: Successfully login
    Given I am in the login page
    When Type my user and my pass
      | user  |
      | password |
    Then The main page should be open
