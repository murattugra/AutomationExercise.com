package pages;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Tc14Page {

    public Tc14Page() {PageFactory.initElements(Driver.getDriver(),this);}



    public WebElement randomAddToCart (){

        Faker faker = new Faker();
        int randomSayi =faker.random().nextInt(2,35);
        WebElement randomAddToCart = Driver.getDriver().findElement(By.xpath("//body[1]/section[2]/div[1]/div[1]/div[2]/div[1]/div["+randomSayi+"]/div[1]/div[1]/div[1]/a[1]"));

        return randomAddToCart;
    }


    @FindBy(xpath = "//u[normalize-space()='View Cart']")
    public WebElement viewCartButton;

    @FindBy(xpath = "//li[normalize-space()='Shopping Cart']")
    public WebElement shoppingCartText;

    @FindBy(xpath = "//a[normalize-space()='Proceed To Checkout']")
    public WebElement proceedToCheckOutButton;

    @FindBy(xpath = "//u[normalize-space()='Register / Login']")
    public WebElement registerLoginButton;

    @FindBy(xpath="//a[normalize-space()='Delete Account']")
    public WebElement deleteAccount;

    @FindBy(xpath="//button[normalize-space()='Delete']")
    public WebElement deleteButton;



    @FindBy(xpath="//input[@placeholder='Name']")
    public WebElement newUserName;
    @FindBy(xpath="//input[@data-qa='signup-email']")
    public WebElement newUserEmailAddress;
    @FindBy(xpath="//button[normalize-space()='Signup']")
    public WebElement newUserSignupButton;

//ENTER ACCOUNT INFORMATION
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


// Account Created

    @FindBy(xpath="//b[normalize-space()='Account Created!']")
    public WebElement accountCreated;

    @FindBy(xpath="//a[normalize-space()='Continue']")
    public WebElement continueButton;

    @FindBy(xpath="//h4[@class='text-center']")
    public WebElement deleteAccountText;

    @FindBy(xpath="//li[10]//a[1]")
    public WebElement loggedInAsText;

    @FindBy(xpath="//ul[@id='address_delivery']//li[4]")
    public WebElement adressProcessToCheckOut;

    @FindBy(xpath="//ul[@id='address_delivery']//li[@class='address_city address_state_name address_postcode']")
    public WebElement cityStateZipCode;

    @FindBy(xpath="//ul[@id='address_delivery']//li[@class='address_country_name']")
    public WebElement countryProcessToCheckOut;

    @FindBy(xpath="//ul[@id='address_delivery']//li[@class='address_phone']")
    public WebElement mobileNumberProcessToCheckOut;

    @FindBy(xpath="//textarea[@name='message']")
    public WebElement checkoutMessageBox;

    @FindBy(xpath="//a[normalize-space()='Place Order']")
    public WebElement placeOrderButton;

// payment

    @FindBy(xpath="//input[@name='name_on_card']")
    public WebElement nameOnCard;
    @FindBy(xpath="//input[@name='card_number']")
    public WebElement cardNumber;
    @FindBy(xpath="//input[@placeholder='ex. 311']")
    public WebElement cvv;
    @FindBy(xpath="//input[@placeholder='MM']")
    public WebElement cardExpirationMM;
    @FindBy(xpath="//input[@placeholder='YYYY']")
    public WebElement cardExpirationYY;
    @FindBy(xpath="//button[@id='submit']")
    public WebElement payAndConfirmOrder;

//order placed
    @FindBy(xpath="//p[normalize-space()='Congratulations! Your order has been confirmed!']")
    public WebElement siparisOnayYazisi;




}
