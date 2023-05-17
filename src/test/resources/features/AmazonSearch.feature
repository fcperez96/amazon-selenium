@Amazon
Feature: Amazon search

  Scenario: Find and add to cart a Google Home
    Given I am on the Amazon home page
    When I search for "Google Home"
    And I select the first result
    And I add the product to the cart
    Then I should see the product in the cart