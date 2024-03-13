Feature: Testing arithmetic operations for a simple calculator

  Scenario: As a student, I want to execute sum operations on numbers, so I can see the correct results
    Given I have a calculator
    When I sum up 7 and 8
    Then I expect the result to be 15

  Scenario: As a student, I want to execute subtract operations on numbers, so I can see the correct results
    Given I have a calculator
    When I subtract 10 from 20
    Then I expect the result to be 10

  Scenario: As a student, I want to execute multiplication operations on numbers, so I can see the correct results
    Given I have a calculator
    When I multiply 10 times by 20
    Then I expect the result to be 200

  Scenario: As a student, I want to execute division operations on numbers, so I can see the correct results
    Given I have a calculator
    When I divide 21 to 7
    Then I expect the result to be 3