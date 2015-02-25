package com.company.tests;

import com.company.pages.FeaturedArticle;
import com.company.pages.StartPage;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Vyacheslav on 25.02.2015.
 */
public class SwipeLeftMenu extends CommonBaseTest{

    @Test
    public void leftMenuElementsAfterSwipe() throws InterruptedException {
        StartPage.pressSkip(driver);
        FeaturedArticle.swipeToOpenLeftMenu(driver);
        Assert.assertTrue(FeaturedArticle.menuItemsArePresent(driver));

    }
}
