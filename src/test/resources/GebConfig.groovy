import org.openqa.selenium.Platform
import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.firefox.FirefoxBinary
import org.openqa.selenium.firefox.FirefoxDriver
import org.openqa.selenium.remote.DesiredCapabilities
import org.openqa.selenium.remote.RemoteWebDriver


public static final String USERNAME = "guruhadadi1";
public static final String AUTOMATE_KEY = "CREdthD9fPLQZUp11qyr";
public static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";
environments {

    firefox {
        println "gebconfig firefox"
//        System.setProperty("webdriver.firefox.bin", "/Applications/Firefox.app/Contents/MacOS/");
//        FirefoxBinary binary = new FirefoxBinary(new File("/Applications/Firefox.app/Contents/MacOS/"));
//        FirefoxProfile profile = new FirefoxProfile();
//        driver = { new FirefoxDriver(binary, profile) }
        //System.setProperty("webdriver.gecko.driver","/Users/guru/Documents/Projects/TestAutomation/Cuc_Sel_Ebay_Poc/src/test/resources/geckodriver");
        DesiredCapabilities caps = DesiredCapabilities.firefox();
        caps.setCapability("platform", Platform.XP);
        driver = new RemoteWebDriver(new URL(URL), caps);
//        driver = { new FirefoxDriver() }
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