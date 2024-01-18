package org.testify;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task6 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\OneDrive\\Documents\\CICD\\Testify-Automation_School\\Module4b\\Task\\Task6\\src\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        // Navigate to the  demo site
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

        //Click an item to buy
        WebElement addtocart = driver.findElement(By.cssSelector("button[data-test=add-to-cart-sauce-labs-backpack]"));
        addtocart.click();

        //Click to view cart
        WebElement viewcart = driver.findElement(By.cssSelector("a.shopping_cart_link"));
        viewcart.click();

        //Checkout
        WebElement checkout = driver.findElement(By.cssSelector("button#checkout"));
        checkout.click();



// Close the browser
        //driver.quit();
    }
}
