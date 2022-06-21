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




   





}