package org.example;
import org.junit.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


public class Main {
    private WebDriver driver;

    @BeforeMethod
    public void setUp() {
        // The path of the chrome driver
        System.setProperty("webdriver.chrome.driver", "C:\\Windows\\chromedriver-win64\\chromedriver.exe");

        // creating object from webdriver
        driver = new ChromeDriver();
    }
    //creating a test method for testing the above code and handling the execution order and time
    @Test
    public void testLogin() {
        // Navigate to url
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");


        WebElement usernameInput = driver.findElement(By.cssSelector("input[placeholder='Username']"));
        WebElement passwordInput = driver.findElement(By.cssSelector("input[placeholder='Password']"));
        WebElement loginButton = driver.findElement(By.cssSelector("button[type='submit']"));


        // Enter the username and password
        usernameInput.sendKeys("Admin");
        passwordInput.sendKeys("admin123");

        // Click the login button
        loginButton.click();

        String expectedUrl  = "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl,actualUrl);
        // pause screen
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }

    @AfterMethod
    public void tearDown() {
        // Close
        driver.quit();
    }
}