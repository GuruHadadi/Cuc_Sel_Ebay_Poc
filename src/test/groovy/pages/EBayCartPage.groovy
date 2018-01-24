package pages

import geb.Page

public class EBayCartPage extends Page {
    static at = { title.endsWith("Shopping Cart") }
    static content = {
        entireCartSection { $("#ShopCart") }
        cartItems { $("div[id^=sellerBucket") }
        itemPrice { cartItems.find("div.fr.dib").find("div.fw-b")}
        itemTitle { cartItems.find("span[id\$=_title]")}
    }
}