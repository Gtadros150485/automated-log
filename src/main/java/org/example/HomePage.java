package org.example;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Page Object encapsulates the Home Page
 */
public class HomePage {
    protected WebDriver driver;

    // <h1>Hello userName</h1>
    private By messageBy = By.tagName("h1");

    public HomePage(WebDriver driver){
        this.driver = driver;
    }


    public String getExpectedURL() {

        return driver.getCurrentUrl();

    }

    public String getActualURL() {
         String expectedUrl  = "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
         return expectedUrl;
    }

    public HomePage evaluate() {
        Boolean evaulate =getExpectedURL().equals(getActualURL());
        if(evaulate == true){
            return new HomePage(driver);
        }
        else return null;

    }

}