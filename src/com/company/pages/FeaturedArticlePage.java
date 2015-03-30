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


    public static void enterTextInSearchField(String query, WebDriver driver)
    {
        WebElement searchField = driver.findElement(By.name("Search Wikipedia"));
        searchField.sendKeys(query);


    }
}
