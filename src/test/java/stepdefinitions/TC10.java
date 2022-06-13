package stepdefinitions;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;

import pages.TC10_Page;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.IOException;

public class TC10 {

    TC10_Page tc10_page=new TC10_Page();
    Actions actions=new Actions(Driver.getDriver());
    //Faker faker=new Faker();

    @Given("Launch browser")
    public void launch_browser() {


    }
    @Given("Navigate to url {string}")
    public void navigate_to_url(String string) {

        Driver.getDriver().get(ConfigReader.getProperty("Url"));
    }
    @Given("Verify that home page is visible successfully")
    public void verify_that_home_page_is_visible_successfully() {

        String expectedAnasayfa="https://automationexercise.com/";

        String actualAnasayfa=Driver.getDriver().getCurrentUrl();
         System.out.println("actualAnasayfa = " + actualAnasayfa);

        Assert.assertEquals(expectedAnasayfa,actualAnasayfa);


    }

    @Given("Scroll down to footer")
    public void scroll_down_to_footer() {
        ReusableMethods.waitFor(2);
        ReusableMethods.hooverByJS(tc10_page.subscription);

    }
    @Given("Verify text {string}")
    public void verify_text(String string) {
        String expectedText="SUBSCRIPTION";
        String actualText=tc10_page.subscription.getText();
        Assert.assertEquals(expectedText,actualText);


    }
    @Given("Enter email address in input and click arrow button")
    public void enter_email_address_in_input_and_click_arrow_button() {
        tc10_page.subscriptionBox.click();
       actions.sendKeys("ays12@gamil.com").perform();
        Driver.wait(2);
        Driver.waitAndClick(tc10_page.subscriptionOk);

    }
    @Given("Verify success message {string} is visible")
    public void verify_success_message_is_visible(String string) throws IOException {

        ReusableMethods.getScreenshot("You have been successfully subscribed! yazisi");
        //String expectedYazi = "You have been successfully subscribed!";
        //String actualYazi = Driver.getDriver().switchTo().alert().getText();
        //System.out.println("actualYazi = " + actualYazi);
        //Assert.assertEquals(expectedYazi,actualYazi);
            Assert.assertTrue(tc10_page.alert.isDisplayed());
        System.out.println("Alert yazi elementi:"+ tc10_page.alert.getText());
    }

}
