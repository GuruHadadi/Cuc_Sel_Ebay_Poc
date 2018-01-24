package pages

import geb.Page

public class EBayProductPage extends Page {
    static at = { title == "Electronics, Cars, Fashion, Collectibles, Coupons and More | eBay" }
    static content = {
        searchInput { $("#gh-ac") }
        searchButton { $("#gh-btn") }
        searchItemsList { $("#ListViewInner li") }
        firstSearchItemList { $("#ListViewInner li a")[0] }
        firstSearchItemList { $("#isCartBtn_btn") }
    }
}