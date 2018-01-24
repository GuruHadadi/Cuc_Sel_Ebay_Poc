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
        driver = { new FirefoxDriver() }
    }

    chrome {
        println "gebconfig chrome"
        System.setProperty("webdriver.chrome.driver", "/Users/guru/Documents/Projects/Freelancing/Proposals/Cucu_Sel_Gro/CucumberSel/src/test/resources/chromedriver");
        driver = { new ChromeDriver() }
    }

}

baseUrl = "https://www.ebay.com.au/"

baseNavigatorWaiting = true
atCheckWaiting = true