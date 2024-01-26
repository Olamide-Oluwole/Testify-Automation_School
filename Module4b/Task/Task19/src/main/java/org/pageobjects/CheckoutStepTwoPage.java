package org.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutStepTwoPage {

    WebDriver cstdriver = null;

    public CheckoutStepTwoPage(WebDriver driver) {
        cstdriver = driver;
        PageFactory.initElements(cstdriver, this);
    }

    //find the element holding the product name on the overview page
    @FindBy(css = "div.page_wrapper div.checkout_summary_container div.cart_list div.cart_item:nth-child(3) div.cart_item_label a:nth-child(1) > div.inventory_item_name")
    private WebElement cartoverviewtext;

    public WebElement getCartoverviewtext() {
        return cartoverviewtext;
    }

    //find the finish button
    @FindBy(css = " //button[@id='finish']")
    private WebElement finishbtn;

    public WebElement getFinishbtn() {
        return finishbtn;
    }



}
