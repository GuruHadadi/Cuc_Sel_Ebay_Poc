package pages

import geb.Page

public class EBayMainPage extends Page {
    static at = { title.endsWith("| eBay") }
    static content = {
        searchInput { $("#gh-ac") }
        searchButton { $("#gh-btn") }
    }
}