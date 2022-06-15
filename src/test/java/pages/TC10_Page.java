package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class TC10_Page {

    public TC10_Page(){
        PageFactory.initElements(Driver.getDriver(),this);

    }
    //***********************TC10-11 LOCATE******************************************************
    @FindBy(xpath = "//h2[normalize-space()='Subscription']")
    public WebElement subscription;

    @FindBy (xpath = "//input[@id='susbscribe_email']")
    public WebElement subscriptionBox;

    @FindBy (xpath = "//i[@class='fa fa-arrow-circle-o-right']")
    public WebElement subscriptionOk;

    @FindBy (xpath = "//div[@class='alert-success alert']")
    public WebElement alert;

    @FindBy (xpath = "//body[1]/header[1]/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[3]/a[1]")
    public WebElement cartButton;

    //***********************TC12 LOCATE******************************************************

    @FindBy(xpath = "(//a[@class='btn btn-default add-to-cart'])[1]")
    public WebElement addToCart1;

    @FindBy(xpath = "//button[normalize-space()='Continue Shopping']")
    public WebElement continueShopping;

    @FindBy(xpath = "//a[@href='/products']")
    public WebElement products;

    @FindBy(xpath = "(//a[@class='btn btn-default add-to-cart'])[3]")
    public WebElement addToCart2;

    @FindBy(xpath = "//u[text()='View Cart']")
    public WebElement viewCart;

    @FindBy(xpath = "//a[normalize-space()='Blue Top']")
    public WebElement urun1;

    @FindBy(xpath = "//a[normalize-space()='Men Tshirt']")
    public WebElement urun2;

    @FindBy(xpath = "//td[@class='cart_price']//p[contains(text(),'Rs. 400')]")
    public WebElement urun2Price;

    @FindBy(xpath = "//td[@class='cart_price']//p[contains(text(),'Rs. 500')]")
    public WebElement urun1Price;

    @FindBy(xpath = "//tr[@id='product-2']//button[@class='disabled'][normalize-space()='1']")
    public WebElement urun2Miktar;

    @FindBy(xpath = "//tr[@id='product-1']//button[@class='disabled'][normalize-space()='1']")
    public WebElement urun1Miktar;

    @FindBy(xpath = "//p[@class='cart_total_price'][normalize-space()='Rs. 400']")
    public WebElement urun2Total;

    @FindBy(xpath = "//p[@class='cart_total_price'][normalize-space()='Rs. 500']")
    public WebElement urun1Total;


//*************************     TC13 LOCATE    ******************************//

    @FindBy(xpath = "//div[@class='col-sm-9 padding-right']//div[2]//div[1]//div[2]//ul[1]//li[1]//a[1]")
    public WebElement urunView;

    @FindBy(xpath = "//input[@id='quantity']")
    public WebElement quantity;

    @FindBy(xpath = "//button[normalize-space()='Add to cart']")
    public WebElement urunEkle;


    @FindBy(xpath = "//button[normalize-space()='4']")
    public WebElement urunMiktari;


}
