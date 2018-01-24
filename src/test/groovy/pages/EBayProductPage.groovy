package pages

import geb.Page

public class EBayProductPage extends Page {
    static at = { title.endsWith("| eBay") }
    static content = {
        addToCartButton { $("#isCartBtn_btn") }
    }
}