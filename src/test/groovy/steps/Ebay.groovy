package steps

import cucumber.api.PendingException
import pages.EBayCartPage
import pages.EBayMainPage
import pages.EBayProductPage
import pages.EBaySearchResultsPage
import static cucumber.api.groovy.Hooks.After
import static cucumber.api.groovy.EN.*

/**
 * Created by guru on 23/01/18.
 */

// Global variables
def product_price
def product_title

Given(~/^I am on EBay main page$/) { ->
    to EBayMainPage
}

And(~/^I search for the item "([^"]*)"$/) { String arg1 ->
    at EBayMainPage
    page.searchInput << arg1
    page.searchButton.click()
}

And(~/^I click the first item in the list$/) { ->
    at EBaySearchResultsPage
    //  capture the first product price and title for validating later
    product_title = page.searchItemsList[0].find('.lvtitle').text()
    product_price = page.searchItemsList[0].find('.lvprice').text()
    //  click on 1st product
    page.firstSearchItemList.click()
}

Then(~/^I land on the product page$/) { ->
    at EBayProductPage
}

When(~/^I add the item to cart$/) { ->
    page.addToCartButton.click()
}

Then(~/^product is added successfully$/) { ->
    at EBayCartPage
    //   validate product has been added to the cart
    assert page.itemPrice[0].text() == product_price
    assert page.itemTitle[0].text() == product_title

}
