@TaggedHooks
Feature: Test Tagged Hooks

  @First
  Scenario: This is the First Scenario
    Given this is the first step
    When this is the second step
    Then this is the third step

  @Second
  Scenario: This is the Second Scenario
    Given this is the first step
    When this is the second step
    Then this is the third step

  @Third
  Scenario: This is the Third Scenario
    Given this is the first step
    When this is the second step
    Then this is the third step