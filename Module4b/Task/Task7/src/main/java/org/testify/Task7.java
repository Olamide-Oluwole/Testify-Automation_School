package org.testify;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Task7 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\OneDrive\\Documents\\CICD\\Testify-Automation_School\\Module4b\\Task\\Task7\\src\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        try {
        // Navigate to the weather check site
        driver.get("https://worldweather.wmo.int/en/home.html");
        //maximise the page
        driver.manage().window().maximize();
            Thread.sleep(5000);

        // Find the search field and input the city name
        WebElement searchField = driver.findElement(By.cssSelector("input#q_search"));
        searchField.sendKeys("Lagos");
            Thread.sleep(5000);
        searchField.sendKeys(Keys.RETURN);

        // Wait for the results to load (adjust sleep time as needed)
        Thread.sleep(5000);

        // Get the weather information
        List<WebElement> days = driver.findElements(By.xpath("/html//div[@class='wrapper']/div[6]/div[5]//div" +
                "[@class='city_container']/div[5]/div[@class='city_weekday_n_date']/div[@class='city_fc_date fs0']"));
        List<WebElement> descriptions = driver.findElements(By.xpath("/html//div[@class='wrapper']/div[6]/div[5]//div[@class='city_container']/div[5]/div[@class='city_fc_desc fs0']"));
            Thread.sleep(5000);
        // Print the days and weather descriptions
        for (int i = 0; i < days.size(); i++) {
            System.out.println(days.get(i).getText() + ": " + descriptions.get(i).getText());
        }

    } catch (Exception e) {
        System.err.println("An error occurred: " + e.getMessage());
    }


    }
}
