package org.task18;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.pageobjects.*;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class InventoryPurchase {
    WebDriver driver = null;
    SoftAssert sa = new SoftAssert();


    @Test
    public void navigatetourl() throws InterruptedException {
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\OneDrive\\Documents\\CICD\\Testify-Automation_School\\Module4b\\Task\\Task19\\src\\chromedriver-win64\\chromedriver.exe");
    driver = new ChromeDriver();

    //maximise the page
    driver.manage().window().maximize();

    // Navigate to the  demo site
    driver.get("https://www.saucedemo.com/");
    Thread.sleep(5000);
}

@Test
        public void loginPage() {
    //Instantiate an instance of the Login Class
    LoginPage login = new LoginPage(driver);
    System.out.println("I got here");
    System.out.println(login.getUsername().getText());
    login.getUsername().sendKeys("standard_user");
    login.getPassword().sendKeys("secret_sauce");
    login.getLogin().click();
}

@Test
        public void inventoryPage2() throws InterruptedException {

    //Instantiate an instance of the Inventory Class
    InventoryPage product = new InventoryPage(driver);
    Thread.sleep(5000);
    product.getItem().click();
    product.getViewcart().click();
    String productlabel = product.getProducttext().getText();
    System.out.println("The product label on the inventory page is " + productlabel);
}

}
