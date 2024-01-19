package org.testify;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task9 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\OneDrive\\Documents\\CICD\\Testify-Automation_School\\Module4b\\Task\\Task8\\src\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        //maximise the page
        driver.manage().window().maximize();
//input username and password

        WebElement username = driver.findElement(By.cssSelector("input[id=user-name]"));
        username.sendKeys("standard_user");


        WebElement password = driver.findElement(By.cssSelector("input[id=password]"));
        password.sendKeys("secret_sauce");

        //Click the login button
        WebElement loginbtn = driver.findElement(By.cssSelector("input[name=login-button]"));
        loginbtn.click();

        //navigate back to the login page
        driver.navigate().back();
        Thread.sleep(3000);

        //validate the attribute value of the login button
        String attributevalue = driver.findElement(By.cssSelector("input[name=login-button]")).getAttribute("value");
        System.out.println("The attribute value for login is:  " +attributevalue);

        //Navigate forward
        driver.navigate().forward();
        Thread.sleep(3000);

        //Validate the user is navigated back to the homepage
        String productname = driver.findElement(By.cssSelector("div.page_wrapper div.inventory_container div.inventory_list " +
                "div.inventory_item:nth-child(1) div.inventory_item_description div.inventory_item_label a:nth-child(1) > div.inventory_item_name")).getText();
        System.out.println(productname);

        if (productname.equals("Sauce Labs Backpack")){
            System.out.println("We are back to the homepage");
        }
        else {
            System.out.println("Page is not loaded completely");
        }
    }
}
