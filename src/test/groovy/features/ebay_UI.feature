Feature: Ebay commercial website search and add products

  Scenario Outline: Search 2 products and add them to the cart
    Given I am on EBay login page
    And I search for the item <searchItem>
    And I click the first item in the list
#    Then I land on the home page of demo shop

    Examples:
      | searchItem          |
      | "magic mouse apple" |
      | "Running shoes'     |