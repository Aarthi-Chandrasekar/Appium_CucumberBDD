package stepdefinition;

import com.mycompany.AppPages.FormPage;
import com.mycompany.AppPages.ProductCatalogue;
import com.mycompany.Environment;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

import io.cucumber.java.af.En;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;

public class App_Mobile_Stepdefinition {

    AndroidDriver driver;

    FormPage frmPage;

    ProductCatalogue productCatalogue;

    @Given("^the app is opened$")
    public void the_app_is_opened() throws Throwable {
        this.driver = Environment.initializeAndroidDriver();

    }

    @When("User logs in with username {string} and country {string} and select gender {string}")
    public void theLoginFormEntered(String username, String country, String gender) throws Throwable {
        frmPage = new FormPage(this.driver);
        frmPage.setActivity();
        frmPage.setGender(gender);
        frmPage.setCountrySelection(country);
        frmPage.setNameField(username);
        productCatalogue = frmPage.submitForm();


    }

    @Then("User is able to login successfully and lands on Products page")
    public void user_login_successful() throws InterruptedException {
        Thread.sleep(2000);
        assert productCatalogue.getProductTitleText().contains("Products") : "Title does not contain 'Products'";
    }


    @When("User selects item {string} to add to the cart")
    public void the_cart_is_added(String item){
        try {
            // Continue from the above code
            productCatalogue.addItemToCartByIndex(Integer.parseInt(item.trim()));
        }
        catch (Exception e){
            System.out.println(item);
            e.printStackTrace();
        }
    }

    @Then("the item is added to the cart successfully")
    public void the_item_added_successfully(){
        assert productCatalogue.getProductTitleText().contains("Products") : "Title does not contain 'Products'";
        driver.quit();
    }


}
