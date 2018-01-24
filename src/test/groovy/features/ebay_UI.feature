Feature: Ebay commercial website search and add products

  Scenario Outline: Search 2 products and add them to the cart
    Given I am on EBay main page
    And I search for the item <searchItem>
    And I click the first item in the list
    Then I land on the product page
    When I add the item to cart
    Then product is added successfully

    Examples:
      | searchItem                      |
      | "magic mouse apple"             |
#      | "fitbit blaze screen protector" |