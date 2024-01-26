package org.testify;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.pageobjects.*;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class ItemPurchase {
    WebDriver driver = null;
    SoftAssert sa = new SoftAssert();


    @Test
    public void navigatetourl() throws InterruptedException {
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\OneDrive\\Documents\\CICD\\Testify-Automation_School\\Module4b\\Task\\Task18\\src\\chromedriver-win64\\chromedriver.exe");
    driver = new ChromeDriver();

    //maximise the page
    driver.manage().window().maximize();

    // Navigate to the  demo site
    driver.get("https://www.saucedemo.com/");
}

@Test
        public void sauceLogin() {
    //Instantiate an instance of the Login Class
    LoginPage login = new LoginPage(driver);
    login.getUsername().sendKeys("standard_user");
    login.getPassword().sendKeys("secret_sauce");
    login.getLogin().click();
}

@Test
        public void inventoryPage() throws InterruptedException {

    //Instantiate an instance of the Inventory Class
    InventoryPage product = new InventoryPage(driver);
    Thread.sleep(5000);
    product.getItem().click();
    product.getViewcart().click();
    String productlabel = product.getProducttext().getText();
    System.out.println("The product label on the inventory page is " + productlabel);
}

@Test
        public void cartPage() throws InterruptedException {
    //Instantiate an instance of the Cart Class
    CartPage checkoutnow = new CartPage(driver);
    InventoryPage product2 = new InventoryPage(driver);
    Thread.sleep(5000);
    String carttext = checkoutnow.getCarttext().getText();
    //Confirm that the items you clicked and added to cart are what are displayed on the "YOUR CART" page
    String productlabel2 = product2.getProducttext().getText();
    sa.assertEquals(carttext, productlabel2);
    sa.assertAll();
    //Click the checkout button to proceed
    checkoutnow.getCheckout().click();
}

@Test
        public void completeForm() throws InterruptedException {

    //Instantiate an instance of the CheckoutStepOne Class
    CheckoutStepOnePage senddetails = new CheckoutStepOnePage(driver);
    Thread.sleep(5000);
    senddetails.getFirstname().sendKeys("Olamide");
    senddetails.getLastname().sendKeys("Oluwole");
    senddetails.getPostalcode().sendKeys("105102");
    senddetails.getContinuebtn().click();
}

@Test
        public void overviewPage() throws InterruptedException {

    //Instantiate an instance of the CheckoutStepTwo Class
    CheckoutStepTwoPage overview = new CheckoutStepTwoPage(driver);
    InventoryPage product3 = new InventoryPage(driver);
    Thread.sleep(5000);
    String overviewtext = overview.getCartoverviewtext().getText();

    //Confirm that the items you clicked and added to cart are what are displayed on the "YOUR CART" page
    String productlabel3 = product3.getProducttext().getText();
    sa.assertEquals(overviewtext, productlabel3);
    sa.assertAll();

    //scroll to see the finish button
    JavascriptExecutor scroller = (JavascriptExecutor) driver;
    scroller.executeScript("window.scrollBy(0,1500)");

    //click the finish button
    overview.getFinishbtn().click();
}

@Test
        public void confirmMessage(){
    //Confirm a thank you message is displayed
        CheckoutCompletePage complete = new CheckoutCompletePage(driver);
        String thankyoumessage = (complete.getMessage().getText()).toUpperCase();
        System.out.println(thankyoumessage);
        sa.assertEquals(thankyoumessage,"THANK YOU FOR YOUR ORDER");
        sa.assertAll();
    }
}
