package com.company.pages;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/**
 * Created by Vyacheslav on 03.03.2015.
 */
public class SearchResultsPage {

    public static boolean searchResultIsPresent(String query, AppiumDriver driver)
    {
        WebElement neededSearchResult = driver.findElement(By.name(query));
        //searchField.sendKeys(query);
        if (neededSearchResult.isDisplayed()) {
            return true;
        }
        else return false;

    }
}

