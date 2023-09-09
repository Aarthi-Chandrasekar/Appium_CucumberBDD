package com.mycompany.Pages;

import com.mycompany.Environment;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {


    private By USER = By.xpath("//input[@id='user-name']");

    private By PASSWORD = By.xpath("//input[@id='password']");
    private By LOGIN_BUTTON = By.xpath("//input[@id='login-button']");


    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void landingPage(){
        super.landonPage(Environment.BASE_URL);
    }
    public void clickButton(String button) {
        By BUTTON = By.xpath("//input[@id='" + button + "']");
        super.doClick(BUTTON,Environment.EXPLICIT_WAIT);
    }

    public void setUser(String username) {
        super.doSendKeys(USER, username,10);
    }

    public void setPASSWORD(String password) {
        super.doSendKeys(PASSWORD, password,10);
    }

    public void clickLogin() {
            setUser(Environment.USER_NAME);
            setPASSWORD(Environment.PASSWORD);
            clickButton("login-button");
    }

    public void quit(){
            super.quit();
    }


}
