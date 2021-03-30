Feature: password requirements
  As a new user of money gaming
  password must contain at least six character, one number and one special character

  Scenario Outline: password must have special requirements

    Given user is on registration page
    When password must have requirements
    Then enter at least six character, one number and one special character
    And user should be able to create an account successfully
    When user don't follow restrictions
    Then user should not be able to create an account

    Examples:
      | type     | passwordType     | password |
      | positive | validPassword1   | joedoe1@ |
      | positive | validPassword2   | @joedoe1 |
      | positive | validPassword3   | 1@joedoe |
      | negative | invalidPassword1 | joedoe1  |
      | negative | invalidPassword2 | joedoe@  |
      | negative | invalidPassword3 | joe1@    |
      | negative | invalidPassword4 | joedoe   |
      | negative | blankPassword    |          |