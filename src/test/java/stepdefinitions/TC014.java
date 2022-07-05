package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;
import pages.TC014page;
import pages.Tc14Page;
import utilities.Driver;

public class TC014 {

    TC014page tc014Page =new TC014page();
    Tc14Page tc14Page = new Tc14Page();
    Faker faker=new Faker();

    @Given("ed  Launch browser")
    public void edLaunchBrowser() {

        Driver.getDriver();

    }

    @And("ed  Navigate to url automationexercise.com")
    public void edNavigateToUrlAutomationexerciseCom() {

        Driver.getDriver().get("https://www.automationexercise.com");
    }

    @And("ed  Verify that home page is visible successfully")
    public void edVerifyThatHomePageIsVisibleSuccessfully() {

        String expectedurl="https://www.automationexercise.com/";
        String actualurl=Driver.getDriver().getCurrentUrl();

        Assert.assertEquals(expectedurl,actualurl);

    }

    @And("ed  Add products to cart")
    public void edAddProductsToCart() {

        tc014Page.birinciurunaddToCart.click();
    }

    @And("ed  Click Cart button")
    public void edClickCartButton() {
        Driver.wait(2);
        Driver.getDriver().navigate().to("https://www.automationexercise.com/view_cart");
    }

    @And("ed  Verify that cart page is displayed")
    public void edVerifyThatCartPageIsDisplayed() {
        String expectedurl="https://www.automationexercise.com/view_cart";
        String actualurl=Driver.getDriver().getCurrentUrl();

        Assert.assertEquals(expectedurl,actualurl);

    }

    @And("ed  Click Proceed To Checkout button")
    public void edClickProceedToCheckoutButton() {

       tc014Page.proceedToCheckout.click();

    }

    @And("ed  Click Register Login button")
    public void edClickRegisterLoginButton() {

        tc014Page.registerbutontikla.click();


    }

    @And("ed  Fill all details in Signup and create account")
    public void edFillAllDetailsInSignupAndCreateAccount() {

        tc014Page.name.sendKeys("elif"+Keys.TAB);
        tc014Page.emailAddress.sendKeys(faker.internet().emailAddress());
        tc014Page.signup.click();

        Select select = new Select(tc014Page.countryDropDown);

        tc014Page.mrs.sendKeys("elif"+Keys.TAB);
        tc014Page.AccountPassword.sendKeys("12345"+Keys.TAB);
        tc014Page.DropDownDay.sendKeys("15"+Keys.TAB);
        tc014Page.DropDownMonth.sendKeys("April"+Keys.TAB);
        tc014Page.DropDownYear.sendKeys("2000"+Keys.TAB);


        tc014Page.firstName.sendKeys("elif"+Keys.TAB);
        tc014Page.lastName.sendKeys("deniz"+Keys.TAB);
        tc014Page.company.sendKeys("sirket"+Keys.TAB);
        tc014Page.address.sendKeys("ferah mah.rahat sok. No:21"+Keys.TAB);
        select.selectByIndex(5);
        tc014Page.state.sendKeys("paris"+Keys.TAB);
        tc014Page.city.sendKeys("mexico city"+Keys.TAB);
        tc014Page.zipcode.sendKeys("2250"+Keys.TAB);
        tc014Page.mobileNumber.sendKeys("05542213658");
        tc014Page.createAccountButton.click();


    }

    @And("ed  Verify ACCOUNT CREATED! and click Continue button")
    public void edVerifyACCOUNTCREATEDAndClickContinueButton() {


        String expectedText="ACCOUNT CREATED!";
        String actualText= tc14Page.accountCreated.getText();

        Assert.assertEquals(expectedText,actualText);

        tc14Page.continueButton.click();




    }

    @And("ed  Verify Logged in as username at top")
    public void edVerifyLoggedInAsUsernameAtTop() {

        Assert.assertTrue(tc14Page.loggedInAsText.getText().contains("Logged in as"));
    }

    @And("ed  Verify Address Details and Review Your Order")
    public void edVerifyAddressDetailsAndReviewYourOrder() {

        Assert.assertTrue(tc14Page.adressProcessToCheckOut.isDisplayed());


    }

    @And("ed  Enter description in comment text area and click Place Order")
    public void edEnterDescriptionInCommentTextAreaAndClickPlaceOrder() {

        tc14Page.placeOrderMessageBox.sendKeys("siparis mesaji");
        tc14Page.placeOrderButton.click();

    }

    @And("ed  Enter payment details: Name on Card, Card Number, CVC, Expiration date")
    public void edEnterPaymentDetailsNameOnCardCardNumberCVCExpirationDate() {

        tc14Page.nameOnCard.sendKeys("Ali");
        tc14Page.cardNumber.sendKeys("1212121245636365");
        tc14Page.cvcNumber.sendKeys("523");
        tc14Page.expirationMM.sendKeys("10");
        tc14Page.expirationYY.sendKeys("2025");



    }

    @And("ed  Click Pay and Confirm Order button")
    public void edClickPayAndConfirmOrderButton() {


        tc14Page.payAndConfirmOrderButton.click();
    }

    @And("ed  Verify success message Your order has been placed successfully!")
    public void edVerifySuccessMessageYourOrderHasBeenPlacedSuccessfully() {


        Assert.assertTrue(tc014Page.pleaseOrdertButton.isDisplayed());

    }

    @And("ed  Click Delete Account button")
    public void edClickDeleteAccountButton() {
    }

    @Then("ed  Verify ACCOUNT DELETED! and click Continue button")
    public void edVerifyACCOUNTDELETEDAndClickContinueButton() {
    }
}
