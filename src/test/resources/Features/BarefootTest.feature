@Item
Feature: Customer can remove one or more item from the mini basket

  Scenario Outline: Customer can update order successfully
    Given I am on the barefoot login page
    And I enter "<Email>" "<Password>"
    And I click on sign in
    And I click on latest
    And I click on leather nourisher
    And I click Add to basket
    And I click on mini basket
    And I click on remove an item
    And click on okay
    Then item is removed and basket updated

    Examples:
      | Email                       | Password     |
      | firstcustomer2050@gmail.com | Customer2050 |