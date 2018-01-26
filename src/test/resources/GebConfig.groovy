import org.openqa.selenium.Platform
import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.firefox.FirefoxBinary
import org.openqa.selenium.firefox.FirefoxDriver
import org.openqa.selenium.remote.DesiredCapabilities
import org.openqa.selenium.remote.RemoteWebDriver


def final String USERNAME = "guruhadadi1";
def final String AUTOMATE_KEY = "CREdthD9fPLQZUp11qyr";
def final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";

environments {

    local_firefox {
        println "gebconfig local firefox"
        driver = { new FirefoxDriver() }
    }

    cloud_firefox {
        println "gebconfig browserstack firefox"
        DesiredCapabilities caps = DesiredCapabilities.firefox();
        caps.setCapability("platform", Platform.XP);
        driver = {new RemoteWebDriver(new URL(URL), caps)}
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