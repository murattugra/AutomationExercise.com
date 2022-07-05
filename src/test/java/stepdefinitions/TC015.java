package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import utilities.Driver;

public class TC015 {


    @Given("ed Launch browser")
    public void edLaunchBrowser() {

        Driver.getDriver();
    }

    @And("ed Navigate to url automationexercise.com")
    public void edNavigateToUrlAutomationexerciseCom() {

        Driver.getDriver().get("https://www.automationexercise.com");
    }

    @And("ed Verify that home page is visible successfully")
    public void edVerifyThatHomePageIsVisibleSuccessfully() {

        String expectedurl="https://www.automationexercise.com/";
        String actualurl=Driver.getDriver().getCurrentUrl();

        Assert.assertEquals(expectedurl,actualurl);
    }

    @And("ed Click Signup Login button")
    public void edClickSignupLoginButton() {
    }

    @And("ed Fill all details in Signup and create account")
    public void edFillAllDetailsInSignupAndCreateAccount() {
    }

    @And("ed Verify ACCOUNT CREATED! and click Continue button")
    public void edVerifyACCOUNTCREATEDAndClickContinueButton() {
    }

    @And("ed Verify  Logged in as username at top")
    public void edVerifyLoggedInAsUsernameAtTop() {
    }

    @And("ed Add products to cart")
    public void edAddProductsToCart() {
    }

    @And("ed Click Cart button")
    public void edClickCartButton() {
    }

    @And("ed Verify that cart page is displayed")
    public void edVerifyThatCartPageIsDisplayed() {
    }

    @And("ed Click Proceed To Checkout")
    public void edClickProceedToCheckout() {
    }

    @And("ed Verify Address Details and Review Your Order")
    public void edVerifyAddressDetailsAndReviewYourOrder() {
    }

    @And("ed Enter description in comment text area and click Place Order")
    public void edEnterDescriptionInCommentTextAreaAndClickPlaceOrder() {
    }

    @And("ed Enter payment details: Name on Card, Card Number, CVC, Expiration date")
    public void edEnterPaymentDetailsNameOnCardCardNumberCVCExpirationDate() {
    }

    @And("ed Click Pay and Confirm Order button")
    public void edClickPayAndConfirmOrderButton() {
    }

    @And("ed Verify success message Your order has been placed successfully!")
    public void edVerifySuccessMessageYourOrderHasBeenPlacedSuccessfully() {
    }

    @And("ed Click Delete Account button")
    public void edClickDeleteAccountButton() {
    }

    @Then("ed Verify ACCOUNT DELETED! and click Continue button")
    public void edVerifyACCOUNTDELETEDAndClickContinueButton() {
    }
}
