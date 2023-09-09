package com.mycompany.Pages;

import com.mycompany.Environment;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class BasePage {

    protected WebDriver driver;



    public BasePage(WebDriver webDriver) {
            this.driver = webDriver;
    }

    public void landonPage(String pageUrl){
        this.driver.get(pageUrl);
    }

    public void doClick(By byLocator, int explicitWait) {
        new WebDriverWait(driver, explicitWait).until(ExpectedConditions.visibilityOfElementLocated(byLocator)).click();
    }

    public void doSendKeys(By byLocator, String text, int explicitWait) {
        WebElement element = new WebDriverWait(driver, explicitWait).until(ExpectedConditions.visibilityOfElementLocated(byLocator));
        element.clear();
        element.sendKeys(text);
    }

    public String getText(By byLocator, int explicitWait) {
        WebElement element = new WebDriverWait(driver, explicitWait).until(ExpectedConditions.visibilityOfElementLocated(byLocator));
        return element.getText();
    }

    public void doMouseHover(By byLocator, int explicitWait) {
        WebElement element = new WebDriverWait(driver, explicitWait).until(ExpectedConditions.visibilityOfElementLocated(byLocator));
        Actions action = new Actions(driver);
        action.moveToElement(element).perform();
    }

    public void doSelectFromDropdown(By byLocator, String option, int explicitWait) {
        WebElement element = new WebDriverWait(driver, explicitWait).until(ExpectedConditions.visibilityOfElementLocated(byLocator));
        element.click();
        Select select = new Select(element);
        select.selectByVisibleText(option);
    }

    public void checkElementVisibility(By byLocator, int explicitWait) {
        new WebDriverWait(driver, explicitWait).until(ExpectedConditions.visibilityOfElementLocated(byLocator));
    }

    public List<WebElement> getElementList(By byLocator, int explicitWait) {
        return new WebDriverWait(driver, explicitWait).until(ExpectedConditions.visibilityOfAllElementsLocatedBy(byLocator));
    }

    public void quit(){
        this.driver.quit();
        Environment.stop();
    }

}
