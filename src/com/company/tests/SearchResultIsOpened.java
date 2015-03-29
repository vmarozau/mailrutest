package com.company.tests;

import com.company.dataproviders.QueryDataProvider;
import com.company.pages.FeaturedArticlePage;
import com.company.pages.PagePage;
import com.company.pages.SearchResultsPage;
import com.company.pages.StartPage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 * Created by Vyacheslav on 11.03.2015.
 */
public class SearchResultIsOpened extends CommonBaseTest {

    @BeforeTest
    public void pressSkip(){
        StartPage.pressSkip(driver);
    }

//    @AfterMethod
//    public void

    @Test(dataProvider = "query-provider", dataProviderClass = QueryDataProvider.class)
    public void searchResultIsOpened(String query) throws InterruptedException {
        testLogger.testStep("1. Enter text in Search field");
        FeaturedArticlePage.enterTextInSearchField(query, driver);

        testLogger.testStep("2. Tap Search result");
        SearchResultsPage.tapSearchResult(query, driver);

        testLogger.testStep("3. Verify that the opened page matches query");
        Assert.assertTrue(PagePage.searchResultIsPresentInTitle(query, driver), "Search result is not present in title");


    }
}
