package com.mercury.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

public class BasicTest {

    WebDriver driver;

    @BeforeTest
    public static void setupClass() {
        WebDriverManager.chromedriver().setup();
    }

    @BeforeClass
    public void setupTest() {
        driver = new ChromeDriver();
    }

    /*@AfterClass
    public void teardown() {
        if (driver != null) {
            driver.quit();
        }
    }*/

    @Test
    public void firstTest() {
        // Driver settings
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://www.mercury-tours.com/");
    }

    Home h = new Home(driver);

}
