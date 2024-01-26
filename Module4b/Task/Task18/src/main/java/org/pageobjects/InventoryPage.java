package org.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InventoryPage {
    WebDriver idriver =null;
    public InventoryPage(WebDriver driver){
        idriver = driver;
        PageFactory.initElements(idriver, this);
    }

    @FindBy (xpath = "//button[@id='add-to-cart-sauce-labs-backpack']")
    private WebElement item;
    public WebElement getItem(){
        return item;
    }

    @FindBy (xpath = "//body/div[@id='root']/div[@id='page_wrapper']/div[@id='contents_wrapper']/div[@id='header_container']/div[1]/div[3]/a[1]")
    private WebElement viewcart;
    public WebElement getViewcart(){
        return viewcart;
    }

    @FindBy (css = "div.page_wrapper div.inventory_container div.inventory_list div.inventory_item:nth-child(1) div.inventory_item_description div.inventory_item_label a:nth-child(1) > div.inventory_item_name")
    private WebElement producttext;
    public WebElement getProducttext(){
        return producttext;
    }
}
