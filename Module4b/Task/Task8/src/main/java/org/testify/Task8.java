package org.testify;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task8 {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\OneDrive\\Documents\\CICD\\Testify-Automation_School\\Module4b\\Task\\Task8\\src\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
       // try {
            // Navigate to site
            driver.get("https://idorenyinankoh.github.io/loginPage/");
            //maximise the page
            driver.manage().window().maximize();
            Thread.sleep(5000);

        driver.findElement(By.xpath("//input[@id='firstName']")).click();

            //check if the " create account" button is enabled"
        WebElement createBtn = driver.findElement(By.xpath("//button[@id='create']"));
        boolean state = createBtn.isEnabled();
        System.out.println("Is the create button enabled before the form is filled? "+state);

        //Fill the form
        WebElement firstname = driver.findElement(By.xpath("//input[@id='firstName']"));
        firstname.sendKeys("Olamide");

        WebElement lastname = driver.findElement(By.xpath("//input[@id='lastName']"));
        lastname.sendKeys("Oluwole");

        WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
        email.sendKeys("olamide.oluwole0908@gmail.com");

        WebElement gender = driver.findElement(By.xpath("//input[@id='female']"));
        gender.click();

        WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
        password.sendKeys("Testing123@");

        WebElement confirmpassword = driver.findElement(By.xpath("//input[@id='confirmPass']"));
        confirmpassword.sendKeys("Testing123@");


        WebElement aboutyou = driver.findElement(By.xpath("//input[@id='xpLevel']"));
        aboutyou.sendKeys("I am a star");
        aboutyou.click();

        //check if the " create account" button is enabled"
        WebElement createBtn2 = driver.findElement(By.xpath("//button[@id='create']"));
        boolean state2 = createBtn2.isEnabled();
        System.out.println("Is the create button enabled after the form is filled? " +state2);

    }
}
