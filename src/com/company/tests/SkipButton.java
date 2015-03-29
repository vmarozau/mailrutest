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

        testLogger.testStep("1. Press Skip button");
        StartPage.pressSkip(driver);
        testLogger.testStep("2. Verify that WebView appeared");
        Assert.assertTrue(FeaturedArticlePage.isWebViewPresent(driver), "Webview is not found");
}
}