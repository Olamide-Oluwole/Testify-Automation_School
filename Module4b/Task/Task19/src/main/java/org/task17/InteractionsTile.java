package org.task17;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class InteractionsTile {

    @Test
    public void testFilePageNavigation() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com");

        //scroll a little to view the tiles
        JavascriptExecutor scroller = (JavascriptExecutor) driver;
        scroller.executeScript("window.scrollBy(0,1000)");

        // Click on the Elements tile
        WebElement interactionsTile = driver.findElement(By.xpath("//h5[contains(text(),'Interactions')]"));
        interactionsTile.click();

        //Wait for the page to load properly
        Thread.sleep(5000);
        String formtext = driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]")).getText();
        Assert.assertEquals(formtext, "Interactions");



    }
}
