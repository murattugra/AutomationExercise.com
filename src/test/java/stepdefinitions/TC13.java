package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import pages.TC10_Page;
import utilities.Driver;

public class TC13 {
    TC10_Page tc13_page=new TC10_Page();
    Actions actions= new Actions(Driver.getDriver());
    Faker faker=new Faker();

    @Given("Click View Product for any product on home page")
    public void click_view_product_for_any_product_on_home_page() {
        Driver.waitAndClick(tc13_page.urunView);


    }
    @Given("Verify product detail is opened")
    public void verify_product_detail_is_opened() {
        String expectedView="https://automationexercise.com/product_details/1";
        String actualView=Driver.getDriver().getCurrentUrl();
        System.out.println("actualView = " + actualView);
        Assert.assertEquals(expectedView,actualView);

    }
    @Given("Increase quantity to {int}")
    public void ıncrease_quantity_to(Integer int1) {
        Driver.waitAndClick(tc13_page.quantity);
        tc13_page.quantity.clear();
        tc13_page.quantity.sendKeys("4");

    }
    @Given("Click Add to cart button")
    public void click_add_to_cart_button() {
        Driver.waitAndClick(tc13_page.urunEkle);

    }
    @Given("Verify that product is displayed in cart page with exact quantity")
    public void verify_that_product_is_displayed_in_cart_page_with_exact_quantity() {
        String expectedMiktar="4";
        String actualMiktar=tc13_page.urunMiktari.getText();
        Assert.assertEquals(expectedMiktar,actualMiktar);

    }

}


