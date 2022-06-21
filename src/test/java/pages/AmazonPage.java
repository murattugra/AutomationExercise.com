package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

// https://www.amazon.com/
public class AmazonPage {

    @FindBy(id = "nav-cart-count")
    public WebElement navcartcountSpan;

    @FindBy(xpath = "//a[text()='Registry']")
    public WebElement navaLink;

    public AmazonPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
}