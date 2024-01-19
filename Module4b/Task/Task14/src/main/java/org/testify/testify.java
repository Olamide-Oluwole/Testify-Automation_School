package org.testify;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class testify {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\OneDrive\\Documents\\CICD\\Testify-Automation_School\\Module4b\\Task\\Task14\\src\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        // Navigate to https://www.toolsqa.com/
        driver.get("https://www.toolsqa.com/");
        //maximise the page
        driver.manage().window().maximize();
        Thread.sleep(5000);
       driver.findElement(By.xpath("//button[@id='accept-cookie-policy']")).click();
       driver.findElement(By.xpath("//header/nav[1]/div[1]/div[1]/div[4]/a[1]")).click();

    }
}
