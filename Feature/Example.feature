Feature: TestExample

   @Smoke
  Scenario: Multiply with pride
    Given I want to write a step with two numbers
        | 5 |10|
        |12 |30|
    When these two numbers collide
    Then I verify the results  in result

    