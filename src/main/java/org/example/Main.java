package org.example;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        //provide the username
        WebElement username = driver.findElement(By.cssSelector("input[placeholder='Username']"));
        username.isDisplayed();
        username.isEnabled();
        username.sendKeys("Admin");

        WebElement password = driver.findElement(By.cssSelector("input[placeholder='Password']"));
        password.isDisplayed();
        password.isEnabled();
        password.sendKeys("admin123");


        WebElement button = driver.findElement(By.cssSelector("button[type='submit']"));
        button.isDisplayed();
        button.isEnabled();
        button.click();



    }
}