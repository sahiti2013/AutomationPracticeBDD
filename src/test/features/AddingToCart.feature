@regression
Feature: Adding dresses to the cart in automationPratice site
  As an user i want to see dresses added to cart successfully.

  Scenario: Verify that user added dresses to cart successfully
    Given user on HomePage
    When he enters text as "dresses" in search box
    And clicks search button
    Then user should see dresses displayed on the page
    When user clicks Add To Cart button
    And Clicks Continue Shopping
    And again Clicks Add To Cart button
    And Clicks Proceed To checkout button
    Then user should see Summary of the items added successfully

