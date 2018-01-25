package parallel;

/**
 * Created by guru on 25/01/18.
 */
import java.net.MalformedURLException;

import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class MyTestA {

    public static RemoteWebDriver driver;
    public static String appURL = "https://www.ebay.com.au/";

    @org.testng.annotations.BeforeClass
    @Parameters({ "browser" })
    public void setUp(String browser) throws MalformedURLException {
        System.out.println("*******************");
        driver = Browserz.getDriver(browser);
        driver.manage().window().maximize();
    }

    @Test
    public void testGooglePageTitleInFirefox() {
        driver.navigate().to(appURL);
        String strPageTitle = driver.getTitle();
        Assert.assertTrue(strPageTitle.equalsIgnoreCase("Google"), "Page title doesn't match");
    }

    @AfterClass
    public void tearDown() {
        if(driver!=null) {
            System.out.println("Closing browser");
            driver.quit();
        }
    }

}