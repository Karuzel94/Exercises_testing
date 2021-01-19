package webpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SFTours extends BasePage {

    public SFTours(WebDriver driver){
        super(driver);
    }

    @FindBy(xpath = "//span[text()='Home']")
    WebElement home;

    @FindBy(xpath = "//span[text()='Our Coaches']")
    WebElement coaches;

    @FindBy(xpath = "//span[text()='Contact Us']")
    WebElement contact;

    @FindBy(xpath = "//a[@href='Contact_Us.html']")
    WebElement sf;

    @FindBy(xpath = "//span[text()='Specialized Tours']")
    WebElement tours;

    public void clickHome(){
        click(home);
    }

    public void clickCoaches(){
        click(coaches);
    }
    public void clickContact(){
        click(contact);

    }
    public void clickSF(){
        click(sf);

    }
    public void clickSpecializedTours(){
        click(tours);
    }
}
