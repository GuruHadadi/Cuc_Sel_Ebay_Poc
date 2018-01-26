package parallel;

import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.remote.Augmenter;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.io.File;
import java.io.IOException;
import java.net.URL;

/**
 * Created by guru on 24/01/18.
 */
public class TempJavaClassForGrid {
/*
    private WebDriver driver;

    @Before
    public void setUp() throws Exception {
        DesiredCapabilities capability = DesiredCapabilities.firefox();
        capability.setCapability("platform", Platform.MAC);
        capability.setCapability("name", "Parallel test");

        driver = new RemoteWebDriver(
                new URL("http://localhost:4444/wd/hub"),
                capability
        );
    }

    @Test
    public void testSimple() throws Exception {
        driver.get("https://www.ebay.com.au/");

        String title = driver.getTitle();
        System.out.println("Page title is: " + title);

        *//*WebElement element = driver.findElement(By.name("q"));
        element.sendKeys("TestingBot");
        element.submit();
        driver = new Augmenter().augment(driver);
        File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(srcFile, new File("Screenshot.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }*//*
    }

    @After
    public void tearDown() throws Exception {
        driver.quit();
    }*/
}
