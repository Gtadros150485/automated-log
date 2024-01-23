package org.example;

import org.testng.annotations.Test;


import org.openqa.selenium.WebDriver;
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

        SignInPage signInPage = new SignInPage(driver);
        HomePage homePage = signInPage.login();
        System.out.println(homePage.evaluate());

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