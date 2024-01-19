package org.testify;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Task12 {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\OneDrive\\Documents\\CICD\\Testify-Automation_School\\Module4b\\Task\\Task12\\src\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(" https://jqueryui.com/");
        //maximise the page
        driver.manage().window().maximize();
        //click on the resize menu from the left pane

        driver.findElement(By.cssSelector("body.jquery-ui.home.page-template-default.page.page-id-44." +
                "page-slug-index.single-author.singular:nth-child(2) div.clearfix." +
                "row:nth-child(3) div.content-right.twelve.columns div.widget-area:nth-child(2)" +
                " aside.widget:nth-child(1) ul:nth-child(2) li:nth-child(3) > a:nth-child(1)")).click();

//switch to iframe
        driver.switchTo().frame(0);
        Thread.sleep(5000);
        //Drag the box to make a bigger size
       WebElement resize = driver.findElement(By.cssSelector("#resizable"));

        Actions mouse = new Actions(driver);
    //Perform the drag-and-drop to resize the box
        Thread.sleep(5000);
        mouse.clickAndHold(resize).moveByOffset(150, 110).release().perform();



    }
}
