package com.mercury.webpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class More extends BasePage {

    public More(WebDriver driver){
        super(driver);
    }

    @FindBy(xpath = "//a[@href='Specialized_Tours.html'")
    WebElement ret;

    public void clickReturn(){
        click(ret);
    }


}
