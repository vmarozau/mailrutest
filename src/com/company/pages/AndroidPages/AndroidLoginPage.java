package com.company.pages.AndroidPages;

import com.company.pages.LoginPageWiki;
import com.company.pages.StartPage;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by mac-248 on 2/24/15.
 */
public class AndroidLoginPage extends LoginPageWiki{
    //private WebDriver driver;
    public AndroidLoginPage(AppiumDriver driver)
    {
        super(driver);
    }
    @Override
    public boolean isLoginTextPresent (WebDriver driver) {
        WebElement loginText = driver.findElement(By.name("Log in"));
        return loginText.isDisplayed();


    }
}
