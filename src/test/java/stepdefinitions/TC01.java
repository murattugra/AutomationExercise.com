package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import utilities.ConfigReader;
import utilities.Driver;

public class TC01 {
    @Given("HF Launch browser")
    public void hfLaunchBrowser() {
        Driver.getDriver();
    }

    @And("HF Navigate to url {string}")
    public void hfNavigateToUrlHttpAutomationexerciseCom(String arg0) {
        Driver.getDriver().get(arg0);
    }

    @And("HF Verify that home page is visible successfully")
    public void hfVerifyThatHomePageIsVisibleSuccessfully() {

        String expectedUrl = ConfigReader.getProperty("Url");
        String actualUrl=Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(expectedUrl,actualUrl);

    }

    @And("HF Click on {string} button")
    public void hfClickOnSignupLoginButton() {
    }

    @And("HF Verify {string} is visible")
    public void hfVerifyNewUserSignupIsVisible() {
    }

    @And("HF Enter name and email address")
    public void hfEnterNameAndEmailAddress() {
    }

    @And("HF Click {string} button")
    public void hfClickSignupButton() {
    }

    @And("HF Verify that {string} is visible")
    public void hfVerifyThatENTERACCOUNTINFORMATIONIsVisible() {
    }

    @And("HF Fill details: Title, Name, Email, Password, Date of birth")
    public void hfFillDetailsTitleNameEmailPasswordDateOfBirth() {
    }

    @And("HF Select checkbox {string}")
    public void hfSelectCheckboxSignUpForOurNewsletter() {
    }

    @And("HF Fill details: First name, Last name, Company, Address, Address{int}, Country, State, City, Zipcode, Mobile Number")
    public void hfFillDetailsFirstNameLastNameCompanyAddressAddressCountryStateCityZipcodeMobileNumber(int arg0) {
    }

    @And("HF Click {string}")
    public void hfClickCreateAccountButton() {
    }

    @Then("HF Verify that {string} is visible and click {string} button")
    public void hfVerifyThatACCOUNTDELETEDIsVisibleAndClickContinueButton() {
    }
}
