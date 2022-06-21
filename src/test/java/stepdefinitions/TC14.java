package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import pages.Tc14Page;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class TC14 {

    Tc14Page tc14Page = new Tc14Page();


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
