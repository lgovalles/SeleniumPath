Feature: Login functionality
  Background:
    Given I am the main page
    When Navigate to My Account page
    Then I should see the Login form

  Scenario: TC-001 Successfully login
    When I am in the login page
    And Type my user and my pass
      | user  |
      | password |
    Then The main page should be open

    Scenario Outline: <ID> User and Password validation
      When I am in the login page
      And Type the user "<user>" and the pass "<password>"
      Then The system should show the error "<error>"
      Examples:
        |ID    |user|password|error|
        |TC-002|NoUser|NoPass|error|
        |TC-003|user  |      |error|
        |TC-004|      |pass  |error|
        |TC-005|      |      |error|
        |TC-006|USER  |PASS  |error|

    Scenario: TC-007 Password should be masked
      When I am in the login page
      And Type my password "pass"
      Then The system should masked it

    Scenario: TC-008 Sign out should close the session
      When I am login in my account
      And Click on Sign out
      Then If i click on back button should redirect to general page
