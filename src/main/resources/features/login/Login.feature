Feature: Login functionality
  Background:
    Given I am the main page
    When I am in the login page

  Scenario: TC-001 Successfully login
    And Type my user and my pass
      |Testusername|
      |Test_Pas_Love$|
    Then The main page should be open


    Scenario Outline: <ID> User and Password validation
      And Type the user "<user>" and the pass "<password>"
      Then The system should show the error "<error>"
      Examples:
        |ID    |user        |password      |error                                       |
        |TC-002|NoUser      |NoPass        |ERROR: Invalid username. Lost your password?|
        |TC-003|Testusername|              |Error: Password is required.|
        |TC-004|            |Test_Pas_Love$|Error: Username is required.|
        |TC-005|            |              |Error: Username is required.|
        |TC-006|testUserName|tEsT_pAS_LoVe$|ERROR: The password you entered for the username testUserName is incorrect. Lost your password?|

    Scenario: TC-007 Password should be masked
      And Type my password "pass"
      Then The system should masked it

    Scenario: TC-008 Sign out should close the session
      And Type my user and my pass
        |Testusername|
        |Test_Pas_Love$|
      And Click on Sign out
      And Click on back button
      Then should redirect to login page
