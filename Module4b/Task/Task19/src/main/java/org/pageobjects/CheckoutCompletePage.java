package org.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutCompletePage {
    WebDriver ccdriver = null;

    public CheckoutCompletePage(WebDriver driver){
        ccdriver= driver;
        PageFactory.initElements(ccdriver,this);
    }

    @FindBy (xpath = "//h2[contains(text(),'Thank you for your order!')]")
    private WebElement message;
    public WebElement getMessage()
    {
        return  message;
    }
}
