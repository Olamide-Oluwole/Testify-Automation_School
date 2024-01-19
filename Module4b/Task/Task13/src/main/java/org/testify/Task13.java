package org.testify;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Task13 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\OneDrive\\Documents\\CICD\\Testify-Automation_School\\Module4b\\Task\\Task12\\src\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://selenium08.blogspot.com/ ");
        //maximise the page
        driver.manage().window().maximize();
        //click on the search button
        WebElement searchBtn = driver.findElement(By.xpath("//div[contains(text(),'Search')]"));
        searchBtn.click();

        WebElement searchinput = driver.findElement(By.xpath("//header/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/input[1]"));
        searchinput.sendKeys("Demo dropdown");
        searchinput.sendKeys(Keys.RETURN);

        //Click on Read more to load the dropdown
        Thread.sleep(5000);
        driver.findElement(By.xpath("//a[contains(text(),'Read more')]")).click();

        //Scroll down a bit to see the dropdown fields
        JavascriptExecutor scroller = (JavascriptExecutor) driver;
        scroller.executeScript("window.scrollBy(0,500)");

        //Find the country and month dropdowns
        WebElement countrydropdown = driver.findElement(By.xpath("//body/div[1]/div[2]/div[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/article[1]/div[1]/div[1]/div[3]/div[1]/div[1]/select[1]"));
        Select selectcountry = new Select(countrydropdown);
        Thread.sleep(5000);
        selectcountry.selectByVisibleText("Nigeria");

        WebElement monthdropdown = driver.findElement(By.xpath("//body/div[1]/div[2]/div[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/article[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[3]/select[1]"));
        Select month = new Select(monthdropdown);
        //Press down the Control + ENTER to select multiple options
        monthdropdown.sendKeys(Keys.CONTROL);
        monthdropdown.sendKeys(Keys.ENTER);
        month.selectByVisibleText("January");
        month.selectByVisibleText("February");
        month.selectByVisibleText("March");



    }
}
