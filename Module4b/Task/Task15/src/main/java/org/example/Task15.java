package org.example;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;



public class Task15 {
    WebDriver driver = null;

    @BeforeMethod
    public void openBrowser(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\OneDrive\\Documents\\CICD\\Testify-Automation_School\\Module4b\\Task\\Task14\\src\\chromedriver-win64\\chromedriver.exe");

        driver = new ChromeDriver();
        driver.manage().window().maximize();

    }

    @Test
    public void googleSearch() { //test to open google and search for testify
        driver.navigate().to("https://www.google.com/");

        //searching for testify
        WebElement searchBox = driver.findElement(By.cssSelector("#APjFqb"));
        searchBox.click();
        searchBox.sendKeys("testify");
        searchBox.sendKeys(Keys.ENTER);

    }

    @Test
    public void mcDonalds(){
        //Navigating to the mcDonalds site
        driver.navigate().to("https://www.mcdonalds.com/us/en-us.html");


        //Locating the order now button
        WebElement buttonColour = driver.findElement(By.cssSelector("#button-ordernow"));
        //getting the colour of the button
        buttonColour.getCssValue("colour");

        System.out.println("The colour of the Order Now button is: " + buttonColour);

    }

    @AfterMethod
    public void quitBrowser(){
        driver.quit();
    }


}