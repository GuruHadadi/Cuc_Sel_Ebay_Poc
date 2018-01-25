package parallel;

/**
 * Created by guru on 25/01/18.
 */
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.URL;

public class JavaSample {

    public static final String USERNAME = "guruhadadi1";
    public static final String AUTOMATE_KEY = "CREdthD9fPLQZUp11qyr";
    public static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";
    private WebDriver driver;


    @Before
    public void setUp() throws Exception {
        DesiredCapabilities caps = DesiredCapabilities.firefox();
        caps.setCapability("platform", Platform.XP);
        driver = new RemoteWebDriver(new URL(URL), caps);
    }

    @Test
    public void testSimple() throws Exception {
        driver.get("https://www.ebay.com.au/");

        String title = driver.getTitle();
        System.out.println("Page title is: " + title);

    }

    @After
    public void tearDown() throws Exception {
        driver.quit();
    }


    /*public static void main(String[] args) throws Exception {

        DesiredCapabilities caps = new DesiredCapabilities();
//        caps.setCapability("platform", Platform.MAC);
//        caps.setCapability("name", "Parallel test");

//        caps.setCapability("browserName", "chrome");
//        caps.setCapability("os", "Windows");
//        caps.setCapability("os_version", "XP");
//        caps.setCapability("browserstack.debug", "true");

        caps.setCapability("platform", Platform.XP);

        WebDriver driver = new RemoteWebDriver(new URL(URL), caps);
        driver.get("http://www.google.com");
        WebElement element = driver.findElement(By.name("q"));

        element.sendKeys("BrowserStack");
        element.submit();

        System.out.println(driver.getTitle());
        driver.quit();

    }*/
}
