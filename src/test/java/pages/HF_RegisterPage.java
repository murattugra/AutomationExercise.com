package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HF_RegisterPage {


    public HF_RegisterPage() {PageFactory.initElements(Driver.getDriver(),this);}




    @FindBy(xpath="//img[@alt='Website for automation practice']")
    public WebElement websiteForAutomationPractic;
    @FindBy(xpath="//a[normalize-space()='Home']")
    public WebElement home;
    @FindBy(xpath="//a[@href='products']")
    public WebElement Products;
    @FindBy(xpath="/html[1]/body[1]/header[1]/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[3]/a[1]")
    public WebElement cart;
    @FindBy(xpath="//a[normalize-space()='Signup / Login']")
    public WebElement signupLogin;
    @FindBy(xpath="//a[normalize-space()='Contact us']")
    public WebElement contactUs;


    @FindBy(xpath="//input[@placeholder='Password']")
    public WebElement password;
    @FindBy(xpath="//input[@data-qa='login-email']")
    public WebElement emailAddress;
    @FindBy(xpath="//button[normalize-space()='Login']")
    public WebElement login;
    @FindBy(xpath="//input[@placeholder='Name']")
    public WebElement name;
    @FindBy(xpath="//input[@data-qa='signup-email']")
    public WebElement SignupEmailAddress;
    @FindBy(xpath="//button[normalize-space()='Signup']")
    public WebElement signup;



    @FindBy(xpath="//h2[normalize-space()='Subscription']")
    public WebElement subscription;
    @FindBy(xpath="//input[@id='susbscribe_email']")
    public WebElement yourEmailAddress;
    @FindBy(xpath="//button[@id='subscribe']")
    public WebElement subscribe;







}

