package com.company.tests;

import com.company.pages.FeaturedArticlePage;
import com.company.pages.PagePage;
import com.company.pages.StartPage;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 * Created by Vyacheslav on 25.02.2015.
 */
public class SwipeLeftMenu extends CommonBaseTest{

    @BeforeTest
    public void pressSkip(){
        StartPage.pressSkip(driver);
    }
    @Test
    public void leftMenuElementsAfterSwipe() throws InterruptedException {
        testLogger.testStep("Swipe right to open left menu");
        PagePage.swipeToOpenLeftMenu(driver);
        testLogger.testStep("Verify that menu items are present"); //to be rewritten for each menu item
        Assert.assertTrue(PagePage.menuItemsArePresent(driver));

    }
}
