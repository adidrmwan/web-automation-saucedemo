Feature: As a user i have be able to success login so that i can see products page

  Scenario: as user i want to input valid to then i can see success login
    Given user on login page
    When user input valid username
    And user input valid password
    And user click login button
    Then user on products page