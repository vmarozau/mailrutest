package com.company.tests;

import com.company.pages.FeaturedArticlePage;
import com.company.pages.PagePage;
import com.company.pages.StartPage;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Vyacheslav on 25.02.2015.
 */
public class SwipeLeftMenu extends CommonBaseTest{

    @Test
    public void leftMenuElementsAfterSwipe() throws InterruptedException {
        StartPage.pressSkip(driver);
        PagePage.swipeToOpenLeftMenu(driver);
        Assert.assertTrue(PagePage.menuItemsArePresent(driver));

    }
}
