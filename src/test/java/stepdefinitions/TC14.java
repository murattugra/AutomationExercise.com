package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;
import pages.Tc14Page;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class TC14 {

    Tc14Page tc14Page = new Tc14Page();
    Faker faker;


    @Given("Launch browser")
    public void launchBrowser() {
        Driver.getDriver();
    }

    @And("Navigate to url {string}")
    public void navigateToUrlHttpAutomationexerciseCom(String arg0) {
        Driver.getDriver().get(arg0);
    }

    @And("Verify that home page is visible successfully")
    public void verifyThatHomePageIsVisibleSuccessfully() {
        String expectedUrl = ConfigReader.getProperty("Url");
        String actualUrl=Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(expectedUrl,actualUrl);
    }

    @And("Add products to cart")
    public void addProductsToCart() {
        ReusableMethods.clickWithJS(tc14Page.randomAddToCart()); // 2 ile 10 arasinda degere sahip sepet locate ine tiklayacak.
    }


    @And("Click {string} button")
    public void clickCartButton(String button) {


        if(button.contains("Cart")){
            tc14Page.viewCartButton.click();
        }else if(button.contains("Register") && button.contains("Login")){
            tc14Page.registerLoginButton.click();
        }else if(button.contains("Proceed") && button.contains("Checkout")){

        }else if(button.contains("Pay") && button.contains("Confirm")){

        }else if(button.contains("Delete Account")){

        }
        //23.satir
        //9.satir
        //12.satir
        //17.satir
        //21.satir
    }

    @And("Verify that cart page is displayed")
    public void verifyThatCartPageIsDisplayed() {

    Assert.assertTrue("Sepete gidilemedi",tc14Page.shoppingCartText.isDisplayed());

    }

    @And("Click Proceed To Checkout")
    public void clickProceedToCheckout() {
        Driver.wait(1);
        tc14Page.proceedToCheckOutButton.click();
    }

    @And("Fill all details in Signup and create account")
    public void fillAllDetailsInSignupAndCreateAccount() {
    faker=new Faker();
//New User Signup!
    tc14Page.newUserName.sendKeys(faker.name().firstName());
String email = faker.internet().emailAddress(); // gonderecegim email adresini ilerde kullanacagim icin string olarak sakliyoruz.
    tc14Page.newUserEmailAddress.sendKeys(email);
    tc14Page.newUserSignupButton.click(); // click yerine submit methodu da kullanilabilir, jsClick ve actions class ile de yapilabilir.


//ENTER ACCOUNT INFORMATION
        // Mr. veya Mrs. secenegini rastgele sectirdik.
    boolean secenek = faker.random().nextBoolean(); // true veya false donecek, 2 ihtimal var sadece.
    if(secenek){tc14Page.mr.click();}else{tc14Page.mrs.click();}

String password = faker.internet().password(); // gonderecegim sifreyi ilerde kullanacagim icin string olarak sakliyoruz.
    tc14Page.AccountPassword.sendKeys(password);


// dogum tarihi seciminde dropdown kullanilacagi icin select objesi olusturacagiz.

        //gun
        Select select = new Select(tc14Page.DropDownDay);
String randomGun = ""+faker.random().nextInt(1,31); // rastgele 1 ile 31 arasinda String sayi uretecek.
        select.selectByValue(randomGun);

        //ay
        select = new Select(tc14Page.DropDownMonth);
String randomAy= ""+faker.random().nextInt(1,12);
        select.selectByValue(randomAy);

        //yil
        select = new Select(tc14Page.DropDownYear);
String randomYil = ""+faker.random().nextInt(1960,2003);
        select.selectByValue(randomYil);



// ADDRESS INFORMATION

























    }

    @And("Verify {string} and click {string} button")
    public void verifyACCOUNTCREATEDAndClickContinueButton() {
    }

    @And("Verify {string} at top")
    public void verifyLoggedInAsUsernameAtTop() {
    }

    @And("Verify Address Details and Review Your Order")
    public void verifyAddressDetailsAndReviewYourOrder() {
    }

    @And("Enter description in comment text area and click {string}")
    public void enterDescriptionInCommentTextAreaAndClickPlaceOrder() {
    }

    @And("Enter payment details: Name on Card, Card Number, CVC, Expiration date")
    public void enterPaymentDetailsNameOnCardCardNumberCVCExpirationDate() {
    }

    @And("Verify success message {string}")
    public void verifySuccessMessageYourOrderHasBeenPlacedSuccessfully() {
    }
}
