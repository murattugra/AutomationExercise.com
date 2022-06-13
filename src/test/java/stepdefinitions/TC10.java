package stepdefinitions;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import pages.Ayse_Page;
import utilities.ConfigReader;
import utilities.Driver;

public class TC10 {
    Ayse_Page ayse_page=new Ayse_Page();
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
        Driver.waitAndClick(ayse_page.subscription);

    }
    @Given("Verify text {string}")
    public void verify_text(String string) {

    }
    @Given("Enter email address in input and click arrow button")
    public void enter_email_address_in_input_and_click_arrow_button() {

    }
    @Given("Verify success message {string} is visible")
    public void verify_success_message_is_visible(String string) {

    }

}
