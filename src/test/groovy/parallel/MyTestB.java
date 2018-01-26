package parallel;

/**
 * Created by guru on 25/01/18.
 */
import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class MyTestB {

    public static RemoteWebDriver driver;
    public static String appURL = "https://www.ebay.com.au/";

    @BeforeClass
    @Parameters({ "browser" })
    public void setUp(String browser) throws MalformedURLException {
        System.out.println("*******************");
        System.out.println("Test with browser "+browser);
        driver = Browserz.getDriver(browser);
//        driver.manage().window().maximize();
    }

    @Test
    public void testEbayHomeSearch() {
        System.out.println("Opening Ebay");
        driver.navigate().to(appURL);
        driver.findElement(By.id("gh-ac")).sendKeys("magic mouse apple rechargeable Battery");
        driver.findElement(By.id("gh-btn")).click();
        driver.findElements(By.id("ResultSetItems")).get(0).findElements(By.cssSelector("li a")).get(0).click();
        WebElement ele = driver.findElement(By.id("isCartBtn_btn"));
        Assert.assertTrue(ele.isDisplayed(), "Check if add to cart button is displayed");
    }

    @AfterClass
    public void tearDown() {
        if(driver!=null) {
            System.out.println("Closing browser");
            driver.quit();
        }
    }
}