package com.company.pages;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebDriver;

/**
 * Created by Vyacheslav on 24.02.2015.
 */
public abstract class LoginPageWiki {

    private AppiumDriver driver;
    public LoginPageWiki(AppiumDriver driver)
    {
        this.driver = driver;
    }

    public abstract boolean isLoginTextPresent (WebDriver driver);
}
