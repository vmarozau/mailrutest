package com.company.pages;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

/**
 * Created by Vyacheslav on 25.02.2015.
 */
public class FeaturedArticlePage {

    public static boolean isWebViewPresent(WebDriver driver)
    {
        WebElement webView = driver.findElement(By.className("android.webkit.WebView"));
        return webView.isDisplayed();
    }

    public static void swipeToOpenLeftMenu(AppiumDriver driver) throws InterruptedException

    {   //driver.manage().wait(5);
        //driver.wait(5);
        //driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
       // driver.
        Thread.sleep(7000);
        driver.swipe(0,900,900,900,100);

    }
    public static boolean menuItemsArePresent(AppiumDriver driver)
    {
        WebElement logIn = driver.findElement(By.name("Log in"));
        WebElement today = driver.findElement(By.name("Today"));
        if (logIn.isDisplayed()
                && today.isDisplayed())
            return true;
        else return false;

    }
    public static void enterTextInSearchField(String query, AppiumDriver driver)
    {
        WebElement searchField = driver.findElement(By.name("Search Wikipedia"));
        searchField.sendKeys(query);


    }
}
