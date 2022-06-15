package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.openqa.selenium.interactions.Actions;
import pages.TC10_Page;
import utilities.Driver;

public class TC11 {

    TC10_Page tc10_page=new TC10_Page();
    Actions actions=new Actions(Driver.getDriver());
    //Faker faker=new Faker();

    @And("Click Cart button")
    public void clickCartButton() {
        tc10_page.cartButton.click();
    }
}
