@q
Feature: Refund faulty items

  Broken items should be refunded if you have receipt

  Scenario: Returning a broken kettle to the store
    Given that Joanna bought a faulty kettle for $100
    When she return the kettle to the store
    And she show her receipt
    Then she will get $100 refunded
    And get apple