package org.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
WebDriver sdriver = null;
    public LoginPage(WebDriver driver){
    sdriver = driver;
        PageFactory.initElements(sdriver, this);
    }

    @FindBy (xpath = "//input[@id='user-name']")
    private WebElement username;
    public WebElement getUsername(){
        return username;
    }

    //input password
    @FindBy (xpath = "//input[@id='password']")
    private WebElement password;
    public WebElement getPassword(){
        return password;
    }


    //click the login button
    @FindBy (xpath = "//input[@id='login-button']")
    private WebElement login;
    public WebElement getLogin(){
        return login;
    }

}
