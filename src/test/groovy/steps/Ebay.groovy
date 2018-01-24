package steps

import cucumber.api.PendingException
import pages.EBayLoginPage
import static cucumber.api.groovy.EN.*

/**
 * Created by guru on 23/01/18.
 */
Given(~/^I am on EBay login page$/) { ->
    to EBayLoginPage
}

And(~/^I search for the item "([^"]*)"$/) { String arg1 ->
    at EBayLoginPage
    page.searchInput << arg1
    page.searchButton.click()
}

And(~/^I click the first item in the list$/) { ->
    at EBayLoginPage
    page.firstSearchItemList.click()
}