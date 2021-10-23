@tag
Feature: Calculator

  Scenario: calculate rvs of input number
    Given input 4 and operator rvs
    When I calculate rvs
    Then I expect the result 0.25

  Scenario: calculate rvs of input number 0
    Given input 0 and operator rvs
    When I calculate rvs
    Then I expect the result Infinity

  Scenario: calculate sqrt of input number
    Given input 4 and operator sqr
    When I calculate sqr
    Then I expect the result 2

  Scenario: calculate sqrt of negative input number
    Given input -1 and operator sqr
    When I calculate sqr
    Then I expect the result NaN


  Scenario Outline: calculate sqrt and rvs of input number
    Given input <input> and operator <opt>
    When I calculate <opt>
    Then I expect the result <result>

    Examples:
      | input | opt | result |
      | 4     | rvs | 0.25   |
      | 4     | sqr | 2      |
      | -10   | sqr | NaN    |
      | 3     | rvs | 0.33   |