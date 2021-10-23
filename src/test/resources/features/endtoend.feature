@EndToEnd
Feature:NHS Costs checker End to End journey

  As a person from Wales
  I need to know what help I can get with my NHS costs
  So that I can get the treatment I need

  Background:
    Given I navigate to NHS Costs checker tool
    When  I am a person from Wales


  Scenario Outline:Wales Test Ticket - Acceptance Criteria
    Given I put my "<age>" circumstances into the Checker tool
    Then I should get a "<age>" result of whether I will get help or not
    Examples:
      | age      |
      | 18 to 24 |
      | 25 to 60 |

  Scenario:Wales Test Ticket - Acceptance Criteria
    Given I put my under 16 circumstances into the Checker tool
    Then I should get a under 16 result of whether I will get help or not

  Scenario:Wales Test Ticket - Acceptance Criteria
    Given I put my over 60 circumstances into the Checker tool
    Then I should get a over 60 result of whether I will get help or not

  Scenario:Wales Test Ticket - Acceptance Criteria
    Given I put my pregnant circumstances into the Checker tool
    Then I should get a pregnant result of whether I will get help or not







