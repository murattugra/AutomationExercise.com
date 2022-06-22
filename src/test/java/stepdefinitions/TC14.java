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
    String firstName;
    String adress;
    String state;
    String city;
    String zipcode;
    String mobileNumber;
    String country;


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
            //tc14Page.viewCartButton.click();
            Driver.wait(1);
            Driver.getDriver().navigate().to("https://automationexercise.com/view_cart");
        }else if(button.contains("Register") && button.contains("Login")){
            tc14Page.registerLoginButton.click();
        }else if(button.contains("Proceed") && button.contains("Checkout")){

            tc14Page.proceedToCheckOutButton.click();

        }else if(button.contains("Pay") && button.contains("Confirm")){

            tc14Page.payAndConfirmOrder.submit();

        }else if(button.contains("Delete Account")){
            tc14Page.deleteAccount.click();
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
 firstName = faker.name().firstName();
    tc14Page.newUserName.sendKeys(firstName);
String email = faker.internet().emailAddress(); /** gonderecegim email adresini ilerde kullanacagim icin string olarak sakliyoruz.*/
    tc14Page.newUserEmailAddress.sendKeys(email);
    tc14Page.newUserSignupButton.submit(); /** click yerine submit methodu da kullanilabilir, jsClick ve actions class ile de yapilabilir.*/


/**ENTER ACCOUNT INFORMATION*/
        /** Mr. veya Mrs. secenegini rastgele sectirdik.*/
    boolean secenek = faker.random().nextBoolean(); // true veya false donecek, 2 ihtimal var sadece.
    if(secenek){tc14Page.mr.click();}else{tc14Page.mrs.click();}

String password = faker.internet().password(); /** gonderecegim sifreyi ilerde kullanacagim icin string olarak sakliyoruz.*/
    tc14Page.AccountPassword.sendKeys(password);



/** dogum tarihi seciminde dropdown kullanilacagi icin select objesi olusturacagiz.*/

        /**gun*/
        Select select = new Select(tc14Page.DropDownDay);
String randomGun = ""+faker.random().nextInt(1,31); // rastgele 1 ile 31 arasinda String sayi uretecek.
        select.selectByValue(randomGun);

        /**ay*/
        select = new Select(tc14Page.DropDownMonth);
String randomAy= ""+faker.random().nextInt(1,12);
        select.selectByValue(randomAy);

        /**yil*/
        select = new Select(tc14Page.DropDownYear);
String randomYil = ""+faker.random().nextInt(1960,2003);
        select.selectByValue(randomYil);



/** ADDRESS INFORMATION */

String firstName = faker.name().firstName();
        tc14Page.firstName.sendKeys(firstName);

String lastName = faker.name().lastName();
        tc14Page.lastName.sendKeys(lastName);

String company = faker.company().name();
        tc14Page.company.sendKeys(company);

adress = faker.address().fullAddress();
        tc14Page.address.sendKeys(adress);

select=new Select(tc14Page.countryDropDown);
        int countryIndex=faker.random().nextInt(0,6);
        select.selectByIndex(countryIndex);
country =select.getFirstSelectedOption().getText(); // ornegin Canada  Israel  India
state = faker.address().state();
        tc14Page.state.sendKeys(state);

city = faker.address().city();
        tc14Page.city.sendKeys(city);

zipcode = faker.address().zipCode();
        tc14Page.zipcode.sendKeys(zipcode);

mobileNumber = faker.phoneNumber().cellPhone();
        tc14Page.mobileNumber.sendKeys(mobileNumber);

        tc14Page.createAccountButton.submit(); // click() methodu da olur.




    }

    @And("Verify {string} and click {string} button")
    public void verifyACCOUNTCREATEDAndClickContinueButton(String str1,String str2 ) {

    String currentUrl = Driver.getDriver().getCurrentUrl();

// https://automationexercise.com/account_created

        if(currentUrl.equals("https://automationexercise.com/account_created")){

            String expectedText = str1.toLowerCase(); // account created!
            String actualText =  tc14Page.accountCreated.getText().toLowerCase();
            Assert.assertEquals(expectedText,actualText);
            tc14Page.continueButton.click();

        }else if (currentUrl.equals("https://automationexercise.com/delete_account")){

            String expectedText =str1; // ACCOUNT DELETED!
            String actualText =tc14Page.deleteAccountText.getText();
            Assert.assertEquals(expectedText,actualText);
            tc14Page.continueButton.click();
        }


    }

    @And("Verify {string} at top")
    public void verifyLoggedInAsUsernameAtTop(String str) {

String expectedText = "Logged in as "+firstName;
String actualtext = tc14Page.loggedInAsText.getText(); // Logged in as {username}

        Assert.assertEquals(expectedText,actualtext);

    }

    @And("Verify Address Details and Review Your Order")
    public void verifyAddressDetailsAndReviewYourOrder() {

// Adres Karsilastirma
String expectedAdress = adress;
String actualAdress =tc14Page.adressProcessToCheckOut.getText();
Assert.assertEquals(expectedAdress,actualAdress);

// city state zipcode karsilastirma
String expectedCityStateZipCode = city+" "+state+" "+zipcode; // city state zipcode
String actualCityStateZipCode = tc14Page.cityStateZipCode.getText();
Assert.assertEquals( expectedCityStateZipCode, actualCityStateZipCode);

// country karsilastirma
String expectedCountry = country;
String actualCountry = tc14Page.countryProcessToCheckOut.getText();
Assert.assertEquals(expectedCountry,actualCountry);

// mobile number karsilastirma
String expectedMobileNumber = mobileNumber;
String actualMobileNumber=tc14Page.mobileNumberProcessToCheckOut.getText();
Assert.assertEquals(expectedMobileNumber,actualMobileNumber);



    }

    @And("Enter description in comment text area and click {string}")
    public void enterDescriptionInCommentTextAreaAndClickPlaceOrder(String str) {
        tc14Page.checkoutMessageBox.sendKeys("Siparis aciklamasi");
        Driver.clickWithJS(tc14Page.placeOrderButton);
    }

    @And("Enter payment details: Name on Card, Card Number, CVC, Expiration date")
    public void enterPaymentDetailsNameOnCardCardNumberCVCExpirationDate() {

String nameOnCard=firstName;
        tc14Page.nameOnCard.sendKeys(nameOnCard);
String creditrCardNumber=faker.business().creditCardNumber();
        tc14Page.cardNumber.sendKeys(creditrCardNumber);
        tc14Page.cvv.sendKeys("321");
        tc14Page.cardExpirationMM.sendKeys("05");
        tc14Page.cardExpirationYY.sendKeys("2025");





    }

    @And("Verify success message {string}")
    public void verifySuccessMessageYourOrderHasBeenPlacedSuccessfully(String str) {

String expectedText = "Congratulations! Your order has been confirmed!";
String actualText = tc14Page.siparisOnayYazisi.getText();
        Assert.assertEquals(expectedText,actualText);


    }
}
