package pages

import geb.Page

public class EBayLoginPage extends Page {
    static at = { title.endsWith("| eBay") }
    static content = {
        searchInput { $("#gh-ac") }
        searchButton { $("#gh-btn") }
        searchItemsList { $("#ListViewInner li") }
        firstSearchItemList { $("#ListViewInner li a")[0] }
        addToCartButton { $("#isCartBtn_btn") }
    }
}