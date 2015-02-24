package com.company.pages.IOSPages;

import com.company.pages.LoginPageWiki;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by mac-248 on 2/24/15.
 */
public class IOSLoginPage extends LoginPageWiki{
    private AppiumDriver driver;
    public IOSLoginPage(AppiumDriver driver){
        super(driver);
    }

    public boolean isLoginTextPresent (WebDriver driver) {
        WebElement loginText = driver.findElement(By.name("Log in"));
        return loginText.isDisplayed();


    }
}
