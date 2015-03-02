package com.company.tests;

import com.company.pages.FeaturedArticlePage;
import com.company.pages.StartPage;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Vyacheslav on 25.02.2015.
 */
public class SkipButton extends CommonBaseTest {

    @Test
    public void skipButtonShouldOpenWebView(){

        StartPage.pressSkip(driver);
        Assert.assertTrue(FeaturedArticlePage.isWebViewPresent(driver));
}
}