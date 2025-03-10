Feature: Login functionality

  Scenario: Successful login
    Given the user is on the login page
    When the user enters username "<username>"
    And the user enters password "<password>"
    Then the user should be logged in

  Examples:
    | username  | password    |
    | standard_user  | secret_sauce |
    | locked_out_user  | secret_sauce |
    
   
