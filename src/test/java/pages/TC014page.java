package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class TC014page {

    public TC014page() {
        PageFactory.initElements(Driver.getDriver(),this);}



    @FindBy(xpath="//body[1]/section[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/a[1]")
    public WebElement birinciurunaddToCart;


    @FindBy(xpath="//u[normalize-space()='View Cart']")
    public WebElement viewCart;

    @FindBy(xpath="//a[normalize-space()='Proceed To Checkout']")
    public WebElement proceedToCheckout;

    @FindBy(xpath="//u[normalize-space()='Register / Login']")
    public WebElement registerbutontikla;

    @FindBy(xpath="//input[@placeholder='Name']")
    public WebElement name;

    @FindBy(xpath="//input[@data-qa='signup-email']")
    public WebElement emailAddress;

    @FindBy(xpath="//button[normalize-space()='Signup']")
    public WebElement signup;

    @FindBy(xpath="//input[@id='id_gender1']")
    public WebElement mr;
    @FindBy(xpath="//input[@id='id_gender2']")
    public WebElement mrs;
    @FindBy(xpath="//input[@id='name']")
    public WebElement AccountName;
    @FindBy(xpath="//input[@id='email']")
    public WebElement AccountEmail;
    @FindBy(xpath="//input[@id='password']")
    public WebElement AccountPassword;

    @FindBy(xpath="//select[@id='days']")
    public WebElement DropDownDay;
    @FindBy(xpath="//select[@id='months']")
    public WebElement DropDownMonth;
    @FindBy(xpath="//select[@id='years']")
    public WebElement DropDownYear;

    @FindBy(xpath="//input[@id='newsletter']")
    public WebElement signUpForOurNewsletter;
    @FindBy(xpath="//input[@id='optin']")
    public WebElement receiveSpecialOffersFromOu;



    //ADDRESS INFORMATION
    @FindBy(xpath="//input[@id='first_name']")
    public WebElement firstName;
    @FindBy(xpath="//input[@id='last_name']")
    public WebElement lastName;
    @FindBy(xpath="//input[@id='company']")
    public WebElement company;
    @FindBy(xpath="//input[@id='address1']")
    public WebElement address;
    @FindBy(xpath="//input[@id='address2']")
    public WebElement address2;
    @FindBy(xpath="//select[@id='country']")
    public WebElement countryDropDown;
    @FindBy(xpath="//input[@id='state']")
    public WebElement state;
    @FindBy(xpath="//input[@id='city']")
    public WebElement city;
    @FindBy(xpath="//input[@id='zipcode']")
    public WebElement zipcode;
    @FindBy(xpath="//input[@id='mobile_number']")
    public WebElement mobileNumber;
    @FindBy(xpath="//button[normalize-space()='Create Account']")
    public WebElement createAccountButton;


    @FindBy(xpath=" //b[normalize-space()='Order Placed!']")
    public WebElement pleaseOrdertButton;




}
