Feature: As a user i have be able to success login so that i can see products page

  @Positive
  Scenario: as user i want to input valid to then i can see success login
    Given user on login page
    When user input valid username
    And user input valid password
    And user click login button
    Then user on products page

  @Negative
  Scenario: as user i want to input invalid username then get error message
    Given user on login page
    When user input invalid username
    And user input valid password
    And user click login button
    Then user see error message