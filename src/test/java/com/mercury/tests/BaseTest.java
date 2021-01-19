package com.mercury.tests;

import com.mercury.webpages.Home;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {

    String url = "http://www.mercury-tours.com/";
    WebDriver driver;
    public Home home;

    public BaseTest(WebDriver driver) {
        this.driver = driver;
    }

    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        home = new Home(driver);
    }

}
