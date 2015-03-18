package com.company.tests;

import com.company.deprecated.BaseTest;
import com.company.pages.FeaturedArticlePage;
import com.company.pages.LoginPage;
import com.company.pages.StartPage;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Vyacheslav on 25.02.2015.
 */
public class TestOCR extends CommonBaseTest {

    @Test
    public void skipButtonShouldOpenWebView(){

        LoginPage.getToastMessageText(driver);
        //Assert.assertTrue(FeaturedArticlePage.isWebViewPresent(driver));
}
}