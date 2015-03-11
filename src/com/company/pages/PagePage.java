package com.company.pages;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

/**
 * Created by Vyacheslav on 03.03.2015.
 */
public class PagePage {

    public static boolean searchResultIsPresentInTitle(String query, AppiumDriver driver)
    {
        WebElement neededSearchResult = driver.findElement(By.name(query));
        //searchField.sendKeys(query);
        if (neededSearchResult.isDisplayed()) {
            return true;
        }
        else return false;
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

    public static void pressHistoryButton (WebDriver driver) {
        WebElement historyButton = driver.findElement(By.name("History"));
        historyButton.click();

    }

    public static boolean areHistoryItemsPresent (String query, WebDriver driver) {
        WebElement historyItem = driver.findElement(By.name(query));
        return historyItem.isDisplayed();

    }
}

