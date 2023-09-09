package com.mycompany.Pages;

import com.mycompany.Environment;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductsPage extends BasePage{


    public ProductsPage(WebDriver driver) {
        super(driver);
    }

    public void clickButton(String button) {
        By BUTTON =  By.cssSelector(button);
        super.doClick(BUTTON,Environment.EXPLICIT_WAIT);
    }

    public String getTitle(){
        return super.driver.getTitle();
    }




}
