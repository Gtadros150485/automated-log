package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignInPage {
    protected WebDriver driver;

    public SignInPage(WebDriver driver){
        this.driver = driver;
        this.driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }


    public HomePage login() {
        WebElement usernameInput = driver.findElement(By.cssSelector("input[placeholder='Username']"));
        WebElement passwordInput = driver.findElement(By.cssSelector("input[placeholder='Password']"));
        WebElement loginButton = driver.findElement(By.cssSelector("button[type='submit']"));
        // Enter the username and password
        usernameInput.sendKeys("Admin");
        passwordInput.sendKeys("admin123");
        // Click the login button
        loginButton.click();
        return new HomePage(driver);
    }

}
