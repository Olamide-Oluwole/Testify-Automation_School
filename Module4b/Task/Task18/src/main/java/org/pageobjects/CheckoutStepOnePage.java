package org.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutStepOnePage {


    WebDriver csdriver = null;

    public CheckoutStepOnePage(WebDriver driver){
        csdriver = driver;
        PageFactory.initElements(csdriver,this);
    }

    //Get the form fields and button
    @FindBy(xpath ="//input[@id='first-name']")
    private WebElement firstname;
    public WebElement getFirstname(){
        return firstname;
    }

    @FindBy(xpath ="//input[@id='last-name']")
    private WebElement lastname;
    public WebElement getLastname(){
        return lastname;
    }

    @FindBy(xpath ="//input[@id='postal-code']")
    private WebElement postalcode;
    public WebElement getPostalcode(){
        return postalcode;
    }


    @FindBy(xpath ="//input[@id='continue']")
    private WebElement continuebtn;
    public WebElement getContinuebtn(){
        return continuebtn;
    }

}
