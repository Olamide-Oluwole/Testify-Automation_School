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
        WebElement searchField = driver.findElement(By.cssSelector("#q_search"));
        searchField.sendKeys("Lagos");
            Thread.sleep(5000);
        searchField.sendKeys(Keys.RETURN);

        // Wait for the results to load (adjust sleep time as needed)
        Thread.sleep(5000);

        // Get the weather information
            List<WebElement> getWeatherForDays = driver.findElements(By.xpath("//div[@class='city_forecast_day_object']"));
            System.out.println(getWeatherForDays);

            for (WebElement element : getWeatherForDays) {
                String daysReturned = element.findElement(By.xpath(".//div[@class='city_fc_date fs0']")).getText();
                daysReturned = daysReturned.substring(8 ,11);

                String weatherForEachDay = element.findElement(By.xpath(".//div[@class='city_fc_temp fs0']")).getText();

                System.out.println("The weather for " + daysReturned + " is Haze with a temperature of" + weatherForEachDay );
            }

    } catch (Exception e) {
        System.err.println("An error occurred: " + e.getMessage());
    }


    }
}
