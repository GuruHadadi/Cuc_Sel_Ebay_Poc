import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.firefox.FirefoxBinary
import org.openqa.selenium.firefox.FirefoxDriver
import org.openqa.selenium.firefox.FirefoxProfile

driver = { new FirefoxDriver() }

environments {

    firefox {
        println "gebconfig firefox"
//        System.setProperty("webdriver.firefox.bin", "/Applications/Firefox.app/Contents/MacOS/");
//        FirefoxBinary binary = new FirefoxBinary(new File("/Applications/Firefox.app/Contents/MacOS/"));
//        FirefoxProfile profile = new FirefoxProfile();
//        driver = { new FirefoxDriver(binary, profile) }
        //System.setProperty("webdriver.gecko.driver","/Users/guru/Documents/Projects/TestAutomation/Cuc_Sel_Ebay_Poc/src/test/resources/geckodriver");
        driver = { new FirefoxDriver() }
    }

    chrome {
        println "gebconfig chrome"
        System.setProperty("webdriver.chrome.driver", "/Users/guru/Documents/Projects/TestAutomation/Cuc_Sel_Ebay_Poc/src/test/resources/chromedriver");
        driver = { new ChromeDriver() }
    }

}

baseUrl = "https://www.ebay.com.au/"

baseNavigatorWaiting = true
atCheckWaiting = true