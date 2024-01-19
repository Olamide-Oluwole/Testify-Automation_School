package org.testify;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task10 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\OneDrive\\Documents\\CICD\\Testify-Automation_School\\Module4b\\Task\\Task10\\src\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(" https://jqueryui.com/");
        //maximise the page
        driver.manage().window().maximize();
        //click on the dialog menu from the left pane


        driver.findElement(By.cssSelector("body.jquery-ui.home.page-template-default.page." +
                "page-id-44.page-slug-index.single-author.singular:nth-child(2) " +
                "div.clearfix.row:nth-child(3) div.content-right.twelve.columns " +
                "div.widget-area:nth-child(2) aside.widget:nth-child(2) ul:nth-child(2)" +
                " li:nth-child(7) > a:nth-child(1)")).click();

//switch to iframe
        driver.switchTo().frame(0);
        Thread.sleep(5000);
        //Click the close button with the selected iframe
        driver.findElement(By.cssSelector("body:nth-child(2) " +
                "div.ui-dialog.ui-corner-all.ui-widget.ui-widget-content.ui-front." +
                "ui-draggable.ui-resizable div.ui-dialog-titlebar.ui-corner-all." +
                "ui-widget-header.ui-helper-clearfix.ui-draggable-handle:nth-child(1)" +
                " button.ui-button.ui-corner-all.ui-widget.ui-button-icon-only." +
                "ui-dialog-titlebar-close > span.ui-button-icon.ui-icon." +
                "ui-icon-closethick")).click();
    }
}
