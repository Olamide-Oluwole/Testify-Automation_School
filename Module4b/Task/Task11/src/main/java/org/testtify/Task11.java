package org.testtify;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

import static java.awt.SystemColor.window;

public class Task11 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\OneDrive\\Documents\\CICD\\Testify-Automation_School\\Module4b\\Task\\Task11\\src\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        //maximise the page
        driver.manage().window().maximize();
        //Find the search field and type in it

        WebElement search = driver.findElement(By.xpath("//textarea[@id='APjFqb']"));
        search.sendKeys("testify ltd");
        search.sendKeys(Keys.RETURN);

        //Wait for the page to load
        Thread.sleep(5000);

        //Click the result with www.testifyltd.com
        driver.findElement(By.xpath("//body/div[@id='main']/div[@id='cnt']/div[@id='rcnt']/div[@id='center_col']/div[@id='res']/div[@id='search']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/span[1]/a[1]/h3[1]")).click();

        //scroll to the bottom of the page
        JavascriptExecutor scroller = (JavascriptExecutor) driver;
        scroller.executeScript("window.scrollBy(0,5500)");

        //get the parent window
        String parentwindow = driver.getWindowHandle();

        //Click the linkedIn icon
        driver.findElement(By.xpath("//body/div[@id='__next']/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/a[1]")).click();

        Set<String> windows = driver.getWindowHandles();
        for (String window: windows){
            driver.switchTo().window(window);
            Thread.sleep(3000);
            System.out.println(driver.getCurrentUrl());
            if (driver.getCurrentUrl().equalsIgnoreCase("https://www.linkedin.com/company/testifyorg")){
                Thread.sleep(3000);
                //driver.findElement(By.tagName("button[aria-label='Dismiss']")).click();
                String text = driver.findElement(By.xpath("//body/div[5]/div[3]/div[1]/div[2]/div[1]/div[2]/main[1]/div[1]" +
                        "/section[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/p[1]")).getText();
                System.out.println(text);
            }
        }

    }

}
