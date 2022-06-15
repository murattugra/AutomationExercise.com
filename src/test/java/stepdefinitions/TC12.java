package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import pages.TC10_Page;
import utilities.Driver;

public class TC12 {

    TC10_Page tc12_page=new TC10_Page();
    Actions actions= new Actions(Driver.getDriver());
    Faker faker=new Faker();

    @Given("Click Products button")
    public void click_products_button() {
        Driver.waitAndClick(tc12_page.products);

    }
    @Given("Hover over first product and click Add to cart")
    public void hover_over_first_product_and_click_add_to_cart() {
        Driver.waitAndClick(tc12_page.addToCart1);

    }
    @Given("Click Continue Shopping button")
    public void click_continue_shopping_button() {
        Driver.waitAndClick(tc12_page.continueShopping);

    }
    @Given("Hover over second product and click Add to cart")
    public void hover_over_second_product_and_click_add_to_cart() {
        Driver.waitAndClick(tc12_page.addToCart2);

    }
    @Given("Click View Cart button")
    public void click_view_cart_button() {
        Driver.waitAndClick(tc12_page.viewCart);

    }
    @Given("Verify both products are added to Cart")
    public void verify_both_products_are_added_to_cart() {
        Assert.assertTrue(tc12_page.urun1.isDisplayed());
        Assert.assertTrue(tc12_page.urun2.isDisplayed());

    }
    @Given("Verify their prices, quantity and total price")
    public void verify_their_prices_quantity_and_total_price() {
        String expectedPrice= "Rs. 500";
        String actualPrice=tc12_page.urun1Price.getText();
        System.out.println("actualPrice = " + actualPrice);
        Assert.assertEquals(expectedPrice,actualPrice);

        String expectedQuantity= "1";
        String actualQuantity=tc12_page.urun1Miktar.getText();
        System.out.println("actualQuantity = " + actualQuantity);
        Assert.assertEquals(expectedQuantity,actualQuantity);

        String expectedTotal="Rs. 500";
        String actualTotal=tc12_page.urun1Total.getText();
        System.out.println("actualTotal = " + actualTotal);
        Assert.assertEquals(expectedTotal,actualTotal);

        String expectedPrice2= "Rs. 400";
        String actualPrice2=tc12_page.urun2Price.getText();
        System.out.println("actualPrice2 = " + actualPrice2);
        Assert.assertEquals(expectedPrice2,actualPrice2);

        String expectedQuantity2= "1";
        String actualQuantity2=tc12_page.urun2Miktar.getText();
        System.out.println("actualQuantity2 = " + actualQuantity2);
        Assert.assertEquals(expectedQuantity2,actualQuantity2);

        String expectedTotal2="Rs. 400";
        String actualTotal2=tc12_page.urun2Total.getText();
        System.out.println("actualTotal2 = " + actualTotal2);
        Assert.assertEquals(expectedTotal2,actualTotal2);




    }


    @And("Taraciyi kapat")
    public void taraciyiKapat() {
        Driver.closeDriver();
    }
}


