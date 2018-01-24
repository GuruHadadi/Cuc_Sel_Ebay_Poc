package pages

import geb.Page

public class EBaySearchResultsPage extends Page {
    static at = { title.endsWith("| eBay") }
    static content = {
        searchItemsList { $("#ListViewInner li") }
        firstSearchItemList { $("#ResultSetItems li a")[0] }
    }
}