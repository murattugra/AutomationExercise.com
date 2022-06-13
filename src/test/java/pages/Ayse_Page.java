package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Ayse_Page {
    public Ayse_Page(){
        PageFactory.initElements(Driver.getDriver(),this);

    }
    @FindBy (xpath = "//h2[normalize-space()='Subscription']")
    public WebElement subscription;

    @FindBy (xpath = "//input[@id='susbscribe_email']")
    public WebElement subscriptionBox;

    @FindBy (xpath = "//i[@class='fa fa-arrow-circle-o-right']")
    public WebElement subscriptionOk;





}
