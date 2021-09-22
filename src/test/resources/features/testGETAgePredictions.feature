Feature: test GET name predictions

  Scenario: Test age predictions based on name
    Given I want to get age predictions based on name from api endpoint
    When I request prediction for "<name>"
    Then I get status "200"
    And response contains "name" "<name>"
    And response contains "age" "<age>"

    Examples:
    | name | age |
    | John | 57  |
    | Tony | 47  |
    | Mary | 63  |