package org.testify;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleNavigate {
    public static void main(String[] args) {
        //Set the property of the chrome driver
System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\OneDrive\\Documents\\CICD\\Testify-Automation_School\\Module4b\\Task\\Task2\\src\\chromedriver-win64\\chromedriver.exe");
//launch the browser
WebDriver driver = new ChromeDriver();
//maximise the browser
driver.manage().window().maximize();
//navigate to the google home page
driver.get("https://www.google.com/");
    }
}
