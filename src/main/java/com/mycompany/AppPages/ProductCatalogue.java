package com.mycompany.AppPages;

import java.util.List;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
public class ProductCatalogue {

    AndroidDriver driver;

    @AndroidFindBy(xpath="//android.widget.TextView[@text='ADD TO CART']")
    private List<WebElement> addToCart;
    //driver.findElements(By.xpath("//android.widget.TextView[@text='ADD TO CART']"))
    @AndroidFindBy(id="com.androidsample.generalstore:id/appbar_btn_cart")
    private WebElement cart;

    @AndroidFindBy(xpath="//android.widget.TextView[@text='Products']")
    private WebElement productsElement;

    public ProductCatalogue(AndroidDriver driver)
    {
        this.driver =driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this); //

    }

    public void addItemToCartByIndex(int index)
    {
        addToCart.get(index).click();

    }

    public String getProductTitleText() {
        // Replace with the appropriate locator and value for your "Products" title element
        String expectedTitle = "Products";
        // Locate elements with matching text
        //WebElement pageTitleElement = driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().textContains(\"" + expectedTitle + "\")"));

        // Get the text of the element
        String pageTitle = productsElement.getText();
        return pageTitle;

    }

    }
