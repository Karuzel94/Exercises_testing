package com.mercury.tests;

import com.mercury.webpages.Home;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;
import org.junit.Assert;

public class FirstTest {

    WebDriver driver;

    @BeforeTest
    public static void setupClass() {
        WebDriverManager.chromedriver().setup();
    }

    @BeforeClass
    public void setupTest() {
        driver = new ChromeDriver();
    }

    @AfterClass
    public void teardown() {
        if (driver != null) {
            driver.quit();
        }
    }

    @Test
    public void firstTest() {
        // Driver settings
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://www.mercury-tours.com/");

        Assert.assertTrue("Page address is not correct." , driver.getCurrentUrl().equals("http://www.mercury-tours.com/"));
        Assert.assertTrue("Page title is not Correct." , driver.getTitle().equals("Mercury Tours Home Page"));

        Home h = new Home(driver);
        h.clickCoaches();
        h.clickContact();
        h.clickSF();
        h.clickSpecializedTours();

    }


}
