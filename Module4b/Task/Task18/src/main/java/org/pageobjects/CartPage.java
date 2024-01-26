package org.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {

    WebDriver cdriver = null;

    public CartPage(WebDriver driver){
       cdriver = driver;
        PageFactory.initElements(cdriver,this);
    }

    //Get the product text on the cart page
    @FindBy (css ="div.page_wrapper div.cart_contents_container div.cart_list div.cart_item div.cart_item_label a:nth-child(1) > div.inventory_item_name")
    private WebElement carttext;
    public WebElement getCarttext(){
        return carttext;
    }

    //Get the checkout button on the cart page
    @FindBy (xpath ="//button[@id='checkout']")
    private WebElement checkout;
    public WebElement getCheckout(){
        return checkout;
    }

}
