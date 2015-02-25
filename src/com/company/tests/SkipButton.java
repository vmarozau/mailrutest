package com.company.tests;

import com.company.BaseTest;
import com.company.pages.FeaturedArticle;
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
        Assert.assertTrue(FeaturedArticle.isWebViewPresent(driver));
}
}