package stepdefinition;

import com.mycompany.Environment;
import com.mycompany.Pages.ProductsPage;
import com.mycompany.Pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class Web_Stepdefinition {

    LoginPage loginPage;
    ProductsPage productsPage;

    WebDriver driver;

    @Given("User is on the SauceDemo login page")
    public void user_is_on_the_SauceDemo_login_page() {
        this.driver = Environment.initializeDriver();
        loginPage = new LoginPage(this.driver);
        loginPage.landingPage();
    }

    @When("User logs in with username {string} and password {string}")
    public void user_logs_in_with_username_and_password(String username, String password) {
        loginPage.setUser(username);
        loginPage.setPASSWORD(password);
        loginPage.clickLogin();
    }

    @Then("User is able to login successfully")
    public void user_logs_in_successfully() {
        productsPage = new ProductsPage(this.driver);
		assert ("Swag Labs".equalsIgnoreCase(productsPage.getTitle()));
    }

    @When("User adds an item to the cart")
    public void user_adds_an_item_to_the_cart() {

        productsPage.clickButton(".btn_inventory");
    }

    @Then("The item is added to the cart successfully")
    public void the_item_is_added_to_the_cart_successfully() {
        loginPage.quit();
    }
}