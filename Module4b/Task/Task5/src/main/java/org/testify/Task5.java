package org.testify;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task5 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\OneDrive\\Documents\\CICD\\Testify-Automation_School\\Module4b\\Task\\Task5\\src\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        // Navigate to the Guru99 demo site
        driver.get("https://www.saucedemo.com/");
        //maximise the page
        driver.manage().window().maximize();
//input username and password

        WebElement username = driver.findElement(By.xpath("(//input[@id='user-name'])"));
        username.sendKeys("standard_user");


        WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
        password.sendKeys("secret_sauce");

        //Click the login button
        WebElement loginbtn = driver.findElement(By.xpath("//input[@id='login-button']"));
        loginbtn.click();

        //Click an item to buy
        WebElement addtocart = driver.findElement(By.xpath("//div[@class='inventory_item_description']/descendant::button[1]"));
        addtocart.click();

        //Click to view cart
        WebElement viewcart = driver.findElement(By.xpath("//div[@class='shopping_cart_container']/descendant::a[1]"));
        viewcart.click();

        //Checkout
        WebElement checkout = driver.findElement(By.xpath("//div[@class='cart_footer']/descendant::button[2]"));
        checkout.click();



// Close the browser
        //driver.quit();
    }
}
