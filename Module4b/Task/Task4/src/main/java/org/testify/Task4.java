package org.testify;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.openqa.selenium.support.ui.ExpectedConditions.alertIsPresent;

public class Task4 {
    public static void main(String[] args)  {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\OneDrive\\Documents\\CICD\\Testify-Automation_School\\Module4b\\Task\\Task4\\src\\chromedriver-win64\\chromedriver.exe");

        // Create a new instance of the ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Navigate to the Guru99 demo site
        driver.get("http://demo.guru99.com/");

        //maximise the page
        driver.manage().window().maximize();

        // Click on the "Security Project" menu
        WebElement securityProjectMenu = driver.findElement(By.linkText("Security Project"));
        securityProjectMenu.click();


        // Wait for 30 seconds for an alert to be present
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.alertIsPresent());

        WebElement googleAd = driver.findElement(By.id("ad_position_box"));
        googleAd.click();


//        // Handle the alert (accept, dismiss, or get text, etc.)
//        Alert alert = driver.switchTo().alert();
//        alert.accept();

        // Input text into the email field
        WebElement emailField = driver.findElement(By.name("uid"));
        emailField.sendKeys("olamide.oluwole0908@gmail.com");

        // Input text into the password field
        WebElement passwordField = driver.findElement(By.name("password"));
        passwordField.sendKeys("Jojo1415@");

        // Close the browser
        driver.quit();
    }

    private static ExpectedCondition<Boolean> alertIsPresent() {
        return input -> {
            try {
                Alert alert = input.switchTo().alert();
                return alert != null;
            } catch (Exception e) {
                return false;
            }
        };
    }
}